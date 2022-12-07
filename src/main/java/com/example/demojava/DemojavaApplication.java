package com.example.demojava;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemojavaApplication {

	public static void main(String[] args) {

		SpringApplication.run(DemojavaApplication.class, args);
		System.out.println("Hellow World");
        // integer
		int one = 1;
		System.out.println(one);

		//float
		float floatValue =1.11f;
		System.out.println(floatValue);

		//string
		String stringname = "Nur";
		System.out.println("print Name : " + stringname);





	}

}
