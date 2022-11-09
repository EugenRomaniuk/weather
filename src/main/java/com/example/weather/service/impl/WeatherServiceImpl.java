package com.example.weather.service.impl;

import com.example.weather.entity.Weather;
import com.example.weather.repository.WeatherRepository;
import com.example.weather.service.IWeatherService;
import org.springframework.stereotype.Service;

@Service
public class WeatherServiceImpl implements IWeatherService {

    private final WeatherRepository weatherRepository;

    public WeatherServiceImpl(WeatherRepository weatherRepository) {
        this.weatherRepository = weatherRepository;
    }

    @Override
    public Weather getById(long id) { return weatherRepository.findById(id).orElseThrow(RuntimeException::new); }

    @Override
    public Weather save(Weather weather) { return weatherRepository.save(weather); }
    @Override
    public Weather update(Weather weather) { return weatherRepository.save(weather); }
}
