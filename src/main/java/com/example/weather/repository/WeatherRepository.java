package com.example.weather.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.weather.models.Weather;

public interface WeatherRepository extends JpaRepository<Weather, String>{

}
