package com.example.design_pattern_decorator.Dtos;

import lombok.Data;

import java.util.List;

@Data
public class NewInvoiceDto {
    private String packetName;
    private List<String> fleurs;
}
