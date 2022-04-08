package com.example.learn.request;

import com.example.learn.request.abstractRequest.AbstractContactModel;
import lombok.*;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import static com.example.learn.constant.DataTypeStander.*;

@Data
public class StudentRegistrationModel extends AbstractContactModel {

    @NotBlank(message = "Student name cannot be blank")
    @Pattern(regexp = NAME_REGEX,message = "Alphabets Only")
    @Size(min = FIRST_NAME_MIN, max = FIRST_NAME_MAX, message = "Student name should be {max} and and min {min} character long")
    private String studentName;

    @NotBlank(message = "Faculty cannot be blank")
    private String faculty;

    @NotBlank(message = "Address cannot be blank")
    @Size(min = ADDRESS_MIN,max = ADDRESS_MAX)
    private String address;


}
