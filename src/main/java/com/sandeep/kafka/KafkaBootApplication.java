package com.sandeep.kafka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class KafkaBootApplication {

	public static void main(String[] args) {

		SpringApplication.run(
				new Object[] { KafkaBootApplication.class }, args);
	}
}