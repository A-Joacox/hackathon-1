package com.example.hackathon1.User;

import java.util.List;

public interface UserRepository extends org.springframework.data.jpa.repository.JpaRepository<User, Long> {
    List<User> findAllByCompanyId(Long companyId);
}
