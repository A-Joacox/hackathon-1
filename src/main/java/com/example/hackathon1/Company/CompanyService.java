package com.example.hackathon1.Company;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;

@Service
public class CompanyService {

    @Autowired
    private CompanyRepository companyRepo;

    public Company create(Company company) {
        return companyRepo.save(company);
    }

    public List<Company> listAll() {
        return companyRepo.findAll();
    }

    public Optional<Company> getById(Long id) {
        return companyRepo.findById(id);
    }

    public Company update(Company company) {
        return companyRepo.save(company);
    }

    public void toggleStatus(Long id) {
        companyRepo.findById(id).ifPresent(c -> {
            c.setActive(!c.isActive());
            companyRepo.save(c);
        });
    }
}
