package com.example.RUBABKHALID_QUIZ_APP;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Component;

@EnableJpaRepositories(basePackages = "com.example.RUBABKHALID_QUIZ_APP;")
@SpringBootApplication
public class MyQuizAPP {

	public static void main(String[] args) {
SpringApplication.run(MyQuizApp.class,args);

	}

}
