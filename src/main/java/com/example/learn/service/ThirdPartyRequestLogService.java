package com.example.learn.service;

import com.example.learn.entity.ThirdPartyRequestLog;
import org.springframework.stereotype.Service;

@Service
public interface ThirdPartyRequestLogService {

    ThirdPartyRequestLog save(ThirdPartyRequestLog thirdPartyRequestLog,String requestEvent);

    void updateFailure(ThirdPartyRequestLog thirdPartyRequestLog, String description);

    void updateSuccess(ThirdPartyRequestLog thirdPartyRequestLog, String description);
}
