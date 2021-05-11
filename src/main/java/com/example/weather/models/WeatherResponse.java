package com.example.weather.models;

public class WeatherResponse {
	
	private String name;
	private Details[] weather;
	private Main main;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Details[] getWeather() {
		return weather;
	}
	public void setWeather(Details[] weather) {
		this.weather = weather;
	}
	public Main getMain() {
		return main;
	}
	public void setMain(Main main) {
		this.main = main;
	}
	
//	public String getDetailsMain() {
//		return weather[0].main;
//	}
//	
//	public String getDetailsDescription() {
//		return weather[0].description;
//	}
//	
//	public int getMainTemp() {
//		return main.temp;
//	}
	
	
}
