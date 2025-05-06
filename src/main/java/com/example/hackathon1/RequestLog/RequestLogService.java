package com.example.hackathon1.RequestLog;


import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@Service
public class RequestLogService {

    @Autowired
    private RequestLogRepository logRepo;

    public List<RequestLog> historyByUser(Long userId) {
        return logRepo.findAllByUserId(userId);
    }

    public List<RequestLog> historyByCompany(Long companyId) {
        return logRepo.findAllByCompanyId(companyId);
    }
}

