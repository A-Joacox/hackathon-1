package com.example.hackathon1.auth;

public class AuthResponse {
    private String token;
    private Long userId;
    private Long companyId;
    private String role;

    public AuthResponse(String token, Long userId, Long companyId, String role) {
        this.token = token;
        this.userId = userId;
        this.companyId = companyId;
        this.role = role;
    }

    public String getToken() {
        return token;
    }

    public Long getUserId() {
        return userId;
    }

    public Long getCompanyId() {
        return companyId;
    }

    public String getRole() {
        return role;
    }
}