package com.example.weather;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.RestTemplate;

import com.example.weather.models.Weather;
import com.example.weather.models.WeatherResponse;
import com.example.weather.repository.WeatherRepository;
import com.example.weather.service.WeatherService;

@SpringBootApplication
//@EnableJpaRepositories
public class WeatherApplication {
	
@Autowired
public static WeatherRepository repo;
	

	static final String API_KEY = "00cee4ec666785d158fd1667f3f28ff9";
	static String zipCode = "07306";
	static String baseUrl = "https://api.openweathermap.org/data/2.5/weather?zip=" + zipCode + ",us&appid=" + API_KEY;
	
	public static void main(String[] args) throws HttpClientErrorException{
		SpringApplication.run(WeatherApplication.class, args);
		
		RestTemplate rt = new RestTemplate();
		
		WeatherResponse result;
		
		
		try {
			result = rt.getForObject(baseUrl, WeatherResponse.class);
			
			Weather report = new Weather(zipCode, result.getName(), result.getWeather()[0].getDescription(),
					result.getWeather()[0].getMain(), result.getMain().getTemp());
			System.out.println(report.getCity());
			System.out.println(report.getTemparature());
			System.out.println(report.getDescription());
			System.out.println(report.getWeather());
			System.out.print("report data is "+report);
			repo.save(report);
		}
		catch(HttpClientErrorException e) {
			System.out.println("No data Found with the Zip code: " + zipCode + ", US");
		}
	}

}
