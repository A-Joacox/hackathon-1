package com.example.hackathon1.dto;

import lombok.Data;
@Data
public class ChatDto {
    private String model;     // Ej: "openai/gpt-4"
    private String message;   // Texto de la consulta
    }

