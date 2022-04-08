package com.example.learn.serverResponse;

import org.springframework.http.HttpStatus;

public class ServerUtility {

    public static <T> ServerResponse<T> getSuccessfulResponse(T data, String message) {
        ServerResponse<T> serverResponse = new ServerResponse<>();
        serverResponse.setSuccess(true);
        serverResponse.setMessage(message);
        serverResponse.setData(data);
        serverResponse.setHttpStatus(HttpStatus.OK);
        return serverResponse;
    }

    public static ServerResponse getCreatedResponse(String message) {
        return ServerResponse.builder()
                .message(message)
                .success(true)
                .code(1)
                .httpStatus(HttpStatus.CREATED)
                .build();
    }

    public static ServerResponse getUpdatedResponse(String message) {
        return ServerResponse.builder()
                .message(message)
                .success(true)
                .code(2)
                .httpStatus(HttpStatus.ACCEPTED)
                .build();
    }

    public static ServerResponse getSuccessfulResponse(String message) {
        return ServerResponse.builder()
                .message(message)
                .success(true)
                .httpStatus(HttpStatus.OK)
                .build();
    }

    public static ServerResponse getFailedResponse(String message) {
        return ServerResponse.builder()
                .success(false)
                .message(message)
                .code(0)
                .httpStatus(HttpStatus.NOT_FOUND)
                .build();
    }

    public static ServerResponse getNotfoundResponse(String message) {
        return ServerResponse.builder()
                .success(false)
                .message(message)
                .httpStatus(HttpStatus.NOT_FOUND)
                .build();
    }

    public static ServerResponse getTimeoutResponse(String message, String operationStatus) {
        return ServerResponse.builder()
                .message(message)
                .httpStatus(HttpStatus.REQUEST_TIMEOUT)
                .build();
    }
    public static ServerResponse getBadRequestServerResponse(String message) {
        return ServerResponse.builder()
                .success(false)
                .message(message)
                .httpStatus(HttpStatus.BAD_REQUEST)
                .build();
    }
}
