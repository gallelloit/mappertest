package com.gallelloit.mappertest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MappertestApplication {

	public static void main(String[] args) {
		SpringApplication.run(MappertestApplication.class, args);
		
		Car c = new Car("Seat");
		
		CarDto cdto = CarMapper.INSTANCE.carToCarDto(c);
		
		System.out.println(cdto);
		
	}

}
