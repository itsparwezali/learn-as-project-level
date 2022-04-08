package com.example.learn.constant;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum ThirdPartyRequestConstant {

    REGISTRATION("REGISTRATION","STUDENT_REGISTRATION"),
     UPDATE("UPDATE","STUDENT_UPDATE");

    private final String name;

    private final String description;
}
