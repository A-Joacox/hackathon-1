package com.example.hackathon1.UserLimit;


import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@Service
public class UserLimitService {

    @Autowired
    private UserLimitRepository limitRepo;

    public UserLimit assign(UserLimit l) {
        return limitRepo.save(l);
    }

    public List<UserLimit> listByUser(Long userId) {
        return limitRepo.findAllByUserId(userId);
    }
}

