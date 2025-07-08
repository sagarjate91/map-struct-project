package com.conversion.map_struct_project;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.conversion.map_struct_project")
public class MapStructProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(MapStructProjectApplication.class, args);
	}

}
