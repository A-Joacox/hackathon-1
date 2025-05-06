package com.example.hackathon1.CompanyRestriction;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/company/restrictions")
public class CompanyRestrictionController {

    @Autowired
    private CompanyRestrictionService restrictionService;

    @PostMapping
    public ResponseEntity<CompanyRestriction> create(@RequestBody CompanyRestriction r) {
        return ResponseEntity.ok(restrictionService.create(r));
    }

    @GetMapping
    public ResponseEntity<List<CompanyRestriction>> list(@RequestParam Long companyId) {
        return ResponseEntity.ok(restrictionService.listByCompany(companyId));
    }

    @PutMapping("/{id}")
    public ResponseEntity<CompanyRestriction> update(@PathVariable Long id,
                                                     @RequestBody CompanyRestriction r) {
        r.setId(id);
        return ResponseEntity.ok(restrictionService.update(r));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        restrictionService.delete(id);
        return ResponseEntity.noContent().build();
    }
}

