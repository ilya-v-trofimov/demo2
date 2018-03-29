package com.example.demo2;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

import java.util.Arrays;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@Bean
	public CommandLineRunner runner(ApplicationContext context){
		return new CommandLineRunner() {
			@Override
			public void run(String... args) throws Exception {
				System.out.println("BEANS:");
				String[] beans = context.getBeanDefinitionNames();
				Arrays.sort(beans);
				for (String bean : beans){
					System.out.println(bean);
				}
			}
		};
	}

}
