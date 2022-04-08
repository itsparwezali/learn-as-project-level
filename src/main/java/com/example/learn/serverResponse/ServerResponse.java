package com.example.learn.serverResponse;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.*;
import org.springframework.http.HttpStatus;

import java.time.LocalDateTime;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ServerResponse<T> {

    private HttpStatus httpStatus;

    private String message;

    private T data;

    private boolean success;

    private int code;

    private LocalDateTime dateTime;
}
