package com.example.hackathon1.dto;

import lombok.Data;

@Data
public class CompletionDto {
    private String model;
    private String prompt;
    private int maxTokens;
}
