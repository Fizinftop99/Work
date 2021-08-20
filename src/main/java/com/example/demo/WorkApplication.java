package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class WorkApplication {

		public static void main(String[] args) {
			try {
			SpringApplication.run(WorkApplication.class, args);
			} catch(Exception ex) {
				ex.printStackTrace();
			}
		}


}
