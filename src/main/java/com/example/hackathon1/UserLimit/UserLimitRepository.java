package com.example.hackathon1.UserLimit;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserLimitRepository extends JpaRepository<UserLimit, Long> {
    List<UserLimit> findAllByUserId(Long userId);
}
