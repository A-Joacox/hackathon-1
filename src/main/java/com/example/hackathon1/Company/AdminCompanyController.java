package com.example.hackathon1.Company;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/admin/companies")
public class AdminCompanyController {

    @Autowired
    private CompanyService companyService;

    @PostMapping
    public ResponseEntity<Company> create(@RequestBody Company company) {
        return ResponseEntity.ok(companyService.create(company));
    }

    @GetMapping
    public ResponseEntity<List<Company>> list() {
        return ResponseEntity.ok(companyService.listAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Company> get(@PathVariable Long id) {
        return companyService.getById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PutMapping("/{id}")
    public ResponseEntity<Company> update(@PathVariable Long id, @RequestBody Company company) {
        company.setId(id);
        return ResponseEntity.ok(companyService.update(company));
    }

    @PatchMapping("/{id}/status")
    public ResponseEntity<Void> toggleStatus(@PathVariable Long id) {
        companyService.toggleStatus(id);
        return ResponseEntity.noContent().build();
    }
}
