package com.example.learn.service.serviceImpl;

import com.example.learn.Mapper.StudentMapper;
import com.example.learn.Mapper.ThirdPartyRequestLogMapper;
import com.example.learn.constant.ThirdPartyRequestConstant;
import com.example.learn.constant.ThirdPartyRequestStatusConstant;
import com.example.learn.entity.Student;
import com.example.learn.entity.ThirdPartyRequestLog;
import com.example.learn.exception.StudentExist;
import com.example.learn.exception.StudentNotFoundException;
import com.example.learn.repo.StudentRepository;
import com.example.learn.request.StudentRegistrationModel;
import com.example.learn.serverResponse.ServerResponse;
import com.example.learn.serverResponse.ServerUtility;
import com.example.learn.service.StudentService;
import com.example.learn.service.ThirdPartyRequestLogService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Slf4j
@Component
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentRepository studentRepository;

    @Autowired
    private ThirdPartyRequestLogService thirdPartyRequestLogService;


    @Override
    public ServerResponse saveStudent(StudentRegistrationModel studentRegistrationModel) {

        ThirdPartyRequestLog thirdPartyRequestLog = thirdPartyRequestLogService.save(ThirdPartyRequestLogMapper.setThirdPartyRequestLog(studentRegistrationModel), ThirdPartyRequestConstant.REGISTRATION.getName());
        Optional<Student> student = studentRepository.findByStudentName(studentRegistrationModel.getStudentName());
        if(student.isPresent()){
           thirdPartyRequestLogService.updateFailure(thirdPartyRequestLog,"student exist");
           throw new StudentExist("Student Exist");
        }
        Student student1 = studentRepository.save(StudentMapper.setStudent(studentRegistrationModel));
        ServerResponse<Student> response = ServerUtility.getCreatedResponse( "successful created student");
        thirdPartyRequestLogService.updateSuccess(thirdPartyRequestLog,"student create successful");
        log.info(":: response {} ::",response);
        return response;
    }

    @Override
    public ServerResponse updateStudent(String studentName, StudentRegistrationModel studentRegistrationModel) {

        ThirdPartyRequestLog thirdPartyRequestLog = thirdPartyRequestLogService.save(ThirdPartyRequestLogMapper.setThirdPartyRequestLogForUpdate(studentRegistrationModel), ThirdPartyRequestConstant.UPDATE.getName());
        Optional<Student> student = studentRepository.findByStudentName(studentRegistrationModel.getStudentName());
        if(!student.isPresent()){
            thirdPartyRequestLogService.updateFailure(thirdPartyRequestLog,"student not found");
            throw new StudentNotFoundException("Student not found");
        }
        ServerResponse<Student> response = ServerUtility.getSuccessfulResponse(StudentMapper.setStudent(studentRegistrationModel, student.get()), "update successfully");
        thirdPartyRequestLogService.updateSuccess(thirdPartyRequestLog,"update successfully...!!!");
        log.info(":: response {} ::",response);
       return response;
    }

    @Override
    public ServerResponse<StudentRegistrationModel> findByStudentName(String studentName) {
        return null;
    }

    @Override
    public ServerResponse<StudentRegistrationModel> getAllStudent() {
        return null;
    }

    @Override
    public ServerResponse updateStudent(Long studentId) {
        return null;
    }


}
