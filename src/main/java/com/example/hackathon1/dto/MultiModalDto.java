package com.example.hackathon1.dto;

import lombok.Data;

@Data
public class MultiModalDto {
    private String model;
    private String imageBase64;
    private String caption;
}
