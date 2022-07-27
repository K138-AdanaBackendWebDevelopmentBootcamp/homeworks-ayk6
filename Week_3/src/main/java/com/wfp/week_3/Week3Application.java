package com.wfp.week_3;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.PropertySource;

@SpringBootApplication
@PropertySource("classpath:foo.properties")
public class Week3Application {

	public static void main(String[] args) {

		SpringApplication.run(Week3Application.class, args);
	}

}
