package com.example.demo.dto;

import lombok.Builder;
import lombok.Data;

@Data
public class WalletRequestDTO {
    int amount;
    Long uid;
}
