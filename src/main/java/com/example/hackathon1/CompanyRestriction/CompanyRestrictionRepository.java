package com.example.hackathon1.CompanyRestriction;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CompanyRestrictionRepository extends JpaRepository<CompanyRestriction, Long> {
    List<CompanyRestriction> findAllByCompanyId(Long companyId);
}
