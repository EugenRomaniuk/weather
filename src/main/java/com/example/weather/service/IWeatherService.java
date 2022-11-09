package com.example.weather.service;

import com.example.weather.entity.Weather;

public interface IWeatherService {
    Weather getById(long id);
    Weather save(Weather weather);
    Weather update(Weather weather);
}
