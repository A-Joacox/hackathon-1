package com.example.hackathon1.User;


import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepo;

    public User create(User u) {
        return userRepo.save(u);
    }

    public List<User> listByCompany(Long companyId) {
        return userRepo.findAllByCompanyId(companyId);
    }

    public Optional<User> getById(Long id) {
        return userRepo.findById(id);
    }

    public User update(User u) {
        return userRepo.save(u);
    }
}

