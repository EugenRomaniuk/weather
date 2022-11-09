package com.example.weather.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Getter
public class WeatherCreateDto {
    private Integer temp;
    private Integer humidity;
}
