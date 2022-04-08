package com.example.learn.service;

import com.example.learn.request.StudentRegistrationModel;
import com.example.learn.serverResponse.ServerResponse;
import org.springframework.stereotype.Service;

@Service
public interface StudentService {

  ServerResponse saveStudent(StudentRegistrationModel studentRegistrationModel);

  ServerResponse<StudentRegistrationModel> findByStudentName(String studentName);

  ServerResponse<StudentRegistrationModel> getAllStudent();

  ServerResponse updateStudent(Long studentId);

  ServerResponse updateStudent(String studentName, StudentRegistrationModel studentRegistrationModel);

}
