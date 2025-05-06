package com.example.hackathon1.CompanyRestriction;


import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;

@Service
public class CompanyRestrictionService {

    @Autowired
    private CompanyRestrictionRepository restrictionRepo;

    public CompanyRestriction create(CompanyRestriction r) {
        return restrictionRepo.save(r);
    }

    public List<CompanyRestriction> listByCompany(Long companyId) {
        return restrictionRepo.findAllByCompanyId(companyId);
    }

    public Optional<CompanyRestriction> getById(Long id) {
        return restrictionRepo.findById(id);
    }

    public CompanyRestriction update(CompanyRestriction r) {
        return restrictionRepo.save(r);
    }

    public void delete(Long id) {
        restrictionRepo.deleteById(id);
    }
}

