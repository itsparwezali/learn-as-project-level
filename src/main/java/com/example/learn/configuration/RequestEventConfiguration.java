package com.example.learn.configuration;

import com.example.learn.entity.RequestEvent;
import com.example.learn.util.YmlPropertySourceFactory;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

import java.util.List;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Component
@ConfigurationProperties(prefix = "data-init")
@PropertySource(factory = YmlPropertySourceFactory.class,value = "classpath:requestEvent.yml")
public class RequestEventConfiguration {
    List<RequestEvent>  requestEventsList;
}
