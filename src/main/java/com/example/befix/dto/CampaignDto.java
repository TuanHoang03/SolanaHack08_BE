package com.example.befix.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDate;

@Getter
@Setter

public class CampaignDto {

    private Long id ;

    private String title;

    private String description;

    private LocalDate startTime;

    private LocalDate endTime;

    private BigDecimal total;

    private BigDecimal max;

    private String image;

}
