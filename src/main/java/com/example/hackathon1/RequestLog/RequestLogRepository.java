package com.example.hackathon1.RequestLog;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.Optional;

public interface RequestLogRepository extends JpaRepository<RequestLog, Long> {
    List<RequestLog> findAllByUserId(Long userId);

    @Query("SELECT COUNT(r) FROM RequestLog r WHERE r.user.id = :userId")
    long countByUserId(@Param("userId") Long userId);

    @Query("SELECT COALESCE(SUM(r.tokensUsed),0) FROM RequestLog r WHERE r.user.id = :userId")
    long sumTokensByUserId(@Param("userId") Long userId);

    @Query("SELECT COUNT(r) FROM RequestLog r WHERE r.company.id = :companyId")
    long countByCompanyId(@Param("companyId") Long companyId);

    @Query("SELECT COALESCE(SUM(r.tokensUsed),0) FROM RequestLog r WHERE r.company.id = :companyId")
    long sumTokensByCompanyId(@Param("companyId") Long companyId);
}

