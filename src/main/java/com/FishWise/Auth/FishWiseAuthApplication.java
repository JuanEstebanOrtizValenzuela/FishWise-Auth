package com.FishWise.Auth;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class FishWiseAuthApplication {

	public static void main(String[] args) {
		SpringApplication.run(FishWiseAuthApplication.class, args);
	}

}
