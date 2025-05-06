package com.example.hackathon1.RequestLog;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface RequestLogRepository extends JpaRepository<RequestLog, Long> {
    List<RequestLog> findAllByUserId(Long userId);
    List<RequestLog> findAllByCompanyId(Long companyId);
}
