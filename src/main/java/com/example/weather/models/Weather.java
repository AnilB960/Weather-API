package com.example.weather.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="weatherone")
public class Weather {

	@Id
	@Column(name="Zip")
	private String zip;
	
	@Column(name="City")
	private String city;
	
	@Column(name="Description")
	private String description;
	
	@Column(name="Weather")
	private String weather;
	
	@Column(name="Temparature")
	private double temparature;

	public Weather(String zip, String city, String description, String weather, double temparature) {
		super();
		this.zip = zip;
		this.city = city;
		this.description = description;
		this.weather = weather;
		this.temparature = temparature;
	}

	public String getZip() {
		return zip;
	}

	public void setZip(String zip) {
		this.zip = zip;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getWeather() {
		return weather;
	}

	public void setWeather(String weather) {
		this.weather = weather;
	}

	public double getTemparature() {
		return temparature;
	}

	public void setTemparature(double temparature) {
		this.temparature = temparature;
	}
	
}
