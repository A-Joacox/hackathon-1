package com.example.hackathon1.UserLimit;


import com.example.hackathon1.CompanyRestriction.CompanyRestriction;
import com.example.hackathon1.User.User;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserLimit {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private int maxRequests;

    @Column(nullable = false)
    private int timeWindowMinutes;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id", nullable = false)
    private User user;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "restriction_id", nullable = false)
    private CompanyRestriction restriction;
}

