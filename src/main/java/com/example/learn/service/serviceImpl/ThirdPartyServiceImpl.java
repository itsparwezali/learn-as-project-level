package com.example.learn.service.serviceImpl;

import com.example.learn.constant.ThirdPartyRequestStatusConstant;
import com.example.learn.entity.ThirdPartyRequestLog;
import com.example.learn.repo.ThirdPartyRequestLogRepo;
import com.example.learn.service.ThirdPartyRequestLogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component
public class ThirdPartyServiceImpl implements ThirdPartyRequestLogService {

    @Autowired
    private ThirdPartyRequestLogRepo thirdPartyRequestLogRepo;

    @Override
    public ThirdPartyRequestLog save(ThirdPartyRequestLog thirdPartyRequestLog, String requestEvent) {

        thirdPartyRequestLog.setDescription(requestEvent);
        thirdPartyRequestLog.setStatus(ThirdPartyRequestStatusConstant.INITIATED);
        return thirdPartyRequestLogRepo.save(thirdPartyRequestLog);
    }

    @Override
    public void updateFailure(ThirdPartyRequestLog thirdPartyRequestLog, String description) {
        thirdPartyRequestLog.setDescription(description);
        thirdPartyRequestLog.setStatus(ThirdPartyRequestStatusConstant.FAILUER);
        thirdPartyRequestLogRepo.save(thirdPartyRequestLog);
    }

    @Override
    public void updateSuccess(ThirdPartyRequestLog thirdPartyRequestLog, String description) {
        thirdPartyRequestLog.setDescription(description);
        thirdPartyRequestLog.setStatus(ThirdPartyRequestStatusConstant.SUCCESS);
        thirdPartyRequestLogRepo.save(thirdPartyRequestLog);
    }
}
