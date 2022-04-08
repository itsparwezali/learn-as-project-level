package com.example.learn.Mapper;

import com.example.learn.entity.Student;
import com.example.learn.request.StudentRegistrationModel;

public class StudentMapper {

    public static Student setStudent(StudentRegistrationModel studentRegistrationModel, Student student){

        student.setStudentName(studentRegistrationModel.getStudentName());
        student.setFaculty(studentRegistrationModel.getFaculty());
        student.setMobileNumber(studentRegistrationModel.getMobileNumber());
        student.setEmail(studentRegistrationModel.getEmailAddress());
        student.setAddress(studentRegistrationModel.getAddress());
        return student;
    }

    public static Student setStudent(StudentRegistrationModel studentRegistrationModel){
        Student student = new Student();
        student.setStudentName(studentRegistrationModel.getStudentName());
        student.setMobileNumber(studentRegistrationModel.getMobileNumber());
        student.setAddress(studentRegistrationModel.getAddress());
        student.setEmail(studentRegistrationModel.getEmailAddress());
        student.setFaculty(studentRegistrationModel.getFaculty());
        return student;
    }
}
