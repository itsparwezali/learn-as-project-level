package com.example.learn.service.databaseInitService;

import com.example.learn.configuration.RequestEventConfiguration;
import com.example.learn.entity.RequestEvent;
import com.example.learn.repo.RequestEventRepo;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Slf4j
@Component
@AllArgsConstructor
@Scope("singleton")
public class DatabaseInitialization {

    final private RequestEventRepo requestEventRepo;

    final private RequestEventConfiguration requestEventConfiguration;

    public void init(){
        log.info("database initialize");
        populateRequestEvent();
    }

    private void populateRequestEvent() {

        List<RequestEvent> requestEventsList = requestEventConfiguration.getRequestEventsList();
        if(requestEventRepo.count()<=0){
            requestEventRepo.saveAll(requestEventsList);
        }else {
            List<String> nameList = requestEventsList.stream().map(RequestEvent::getName).collect(Collectors.toList());

            List<String> persistRequestEventName = requestEventRepo.getAllRequestEventName(nameList);

            persistRequestEventName.forEach(e-> System.out.println(e));

            requestEventsList.stream().filter(requestEvent ->!persistRequestEventName.contains(requestEvent.getName())).forEach(e-> requestEventRepo.save(e));


        }

        log.info("populateRequestEvent Type Info Populated.");

    }


}
