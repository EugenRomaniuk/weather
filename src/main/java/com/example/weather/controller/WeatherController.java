package com.example.weather.controller;

import com.example.weather.dto.WeatherCreateDto;
import com.example.weather.entity.Weather;
import com.example.weather.mapper.WeatherDtoMapper;
import com.example.weather.service.IWeatherService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/weather")
public class WeatherController {
    private final IWeatherService iWeatherService;
    private final WeatherDtoMapper mapper;

    public WeatherController(IWeatherService iWeatherService, WeatherDtoMapper mapper) {
        this.iWeatherService = iWeatherService;
        this.mapper = mapper;
    }

    @GetMapping("/{Id}")
    public Weather getById(@PathVariable long Id){
        return iWeatherService.getById(Id);
    }

    @PostMapping
    public void save(@RequestBody WeatherCreateDto dto){
        Weather weather = mapper.toEntity(dto);
        iWeatherService.save(weather);
    }
    @PostMapping
    public  void update(@RequestBody WeatherCreateDto dto){
        Weather weather = mapper.toEntity(dto);
        iWeatherService.update(weather);
    }
}
