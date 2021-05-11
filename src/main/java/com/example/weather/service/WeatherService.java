package com.example.weather.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.weather.models.Weather;
import com.example.weather.repository.WeatherRepository;

@Service
public class WeatherService {
	
	@Autowired
	private WeatherRepository repo;
	
	@Autowired
	public WeatherService(WeatherRepository repo) {
		this.repo = repo;
	}
	
	public void save(Weather obj) {
		repo.save(obj);
	}

}
