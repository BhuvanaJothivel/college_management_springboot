package com.college.abcinstitute;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication
public class AbcinstituteApplication {

	public static void main(String[] args) {
		SpringApplication.run(AbcinstituteApplication.class, args);
		System.out.println("Hey");
	}

}

//mvn clean
//mvn install -DskipTests
//mvn spring-boot:run
