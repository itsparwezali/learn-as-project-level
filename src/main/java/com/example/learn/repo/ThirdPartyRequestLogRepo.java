package com.example.learn.repo;

import com.example.learn.entity.ThirdPartyRequestLog;
import com.example.learn.repo.abstractRepo.AbstractRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ThirdPartyRequestLogRepo extends AbstractRepository<ThirdPartyRequestLog,Long> {
}
