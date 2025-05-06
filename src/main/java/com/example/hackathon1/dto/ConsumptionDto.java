package com.example.hackathon1.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class ConsumptionDto {
    private long requestCount;
    private long tokensUsed;
}
