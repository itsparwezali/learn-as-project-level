package com.example.learn.repo;

import com.example.learn.entity.RequestEvent;
import com.example.learn.repo.abstractRepo.AbstractRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RequestEventRepo extends AbstractRepository<RequestEvent,Long> {

    @Query("select re.name from RequestEvent re where re.name in :names")
    List<String>getAllRequestEventName(@Param("names") List<String> names);
}
