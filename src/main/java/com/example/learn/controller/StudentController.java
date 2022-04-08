package com.example.learn.controller;

import com.example.learn.request.StudentRegistrationModel;
import com.example.learn.serverResponse.ServerResponse;
import com.example.learn.service.StudentService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import javax.validation.Valid;
import static com.example.learn.constant.ApiConstant.*;

@RestController
@RequestMapping(value = STUDENT)
@AllArgsConstructor
public class StudentController {

   final StudentService studentService;

    @PostMapping(value = SAVE)
    public ResponseEntity<ServerResponse> saveStudent(@Valid @RequestBody StudentRegistrationModel studentRegistrationModel){
        ServerResponse serverResponse = studentService.saveStudent(studentRegistrationModel);
        return new ResponseEntity<>(serverResponse,serverResponse.getHttpStatus());

    }

    @PostMapping(value = UPDATE)
    public ResponseEntity<ServerResponse> updateStudent(@Valid @RequestBody StudentRegistrationModel studentRegistrationModel){
        ServerResponse serverResponse = studentService.updateStudent(studentRegistrationModel.getStudentName(),studentRegistrationModel);
        return new ResponseEntity<>(serverResponse,serverResponse.getHttpStatus());

    }
}
