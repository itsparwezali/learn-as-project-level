package com.example.learn.Mapper;

import com.example.learn.entity.ThirdPartyRequestLog;
import com.example.learn.request.StudentRegistrationModel;

import java.util.Date;

public class ThirdPartyRequestLogMapper {

    public static ThirdPartyRequestLog setThirdPartyRequestLog(StudentRegistrationModel studentRegistrationModel){
        ThirdPartyRequestLog thirdPartyRequestLog = new ThirdPartyRequestLog();
        thirdPartyRequestLog.setStudentName(studentRegistrationModel.getStudentName());
        thirdPartyRequestLog.setMobileNumber(studentRegistrationModel.getMobileNumber());
        thirdPartyRequestLog.setRequestDate(new Date());
        return thirdPartyRequestLog;
    }

    public static ThirdPartyRequestLog setThirdPartyRequestLogForUpdate(StudentRegistrationModel studentRegistrationModel){
        ThirdPartyRequestLog thirdPartyRequestLog = new ThirdPartyRequestLog();
        thirdPartyRequestLog.setStudentName(studentRegistrationModel.getStudentName());
        thirdPartyRequestLog.setMobileNumber(studentRegistrationModel.getMobileNumber());
        thirdPartyRequestLog.setLastModifyDate(new Date());
        return thirdPartyRequestLog;
    }
}
