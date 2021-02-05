package com.example.demo.dto;

import lombok.Data;

@Data
public class ReserveDto {
    private String city;
private Long cost;
private String distanse;
private Long start_time;
private int delay;
private Long uid;
private Long TypeTripid;
}