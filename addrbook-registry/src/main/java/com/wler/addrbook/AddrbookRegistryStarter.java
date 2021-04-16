package com.wler.addrbook;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

public class AddrbookRegistryStarter {
	public static void main(String[] args) {
		SpringApplication.run(AddrbookRegistryStarter.class,args);
	}
}
