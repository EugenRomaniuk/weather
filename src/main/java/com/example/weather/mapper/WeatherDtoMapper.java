package com.example.weather.mapper;

import com.example.weather.dto.WeatherCreateDto;
import com.example.weather.entity.Weather;
import org.springframework.stereotype.Component;

@Component
public class WeatherDtoMapper {

    public Weather toEntity(WeatherCreateDto source){
        Weather weather = new Weather();
        weather.setHumidity(source.getHumidity()/100.00);
        weather.setTemperature(source.getTemp()/100.00);
        return weather;
    }
}
