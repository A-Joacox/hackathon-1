package com.example.hackathon1.CompanyRestriction;


import com.example.hackathon1.Company.Company;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class CompanyRestriction {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String modelType;        // e.g. "openai/gpt-4"

    @Column(nullable = false)
    private int maxRequests;

    @Column(nullable = false)
    private int timeWindowMinutes;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "company_id", nullable = false)
    private Company company;
}
