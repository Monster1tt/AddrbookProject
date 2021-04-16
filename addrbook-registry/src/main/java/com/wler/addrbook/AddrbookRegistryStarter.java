package com.wler.addrbook;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * <b>注册中心启动类</b>
 * @author Monster
 * @version 5.0.0
 */
@EnableEurekaServer
@SpringBootApplication
public class AddrbookRegistryStarter {
	public static void main(String[] args) {
		SpringApplication.run(AddrbookRegistryStarter.class, args);
	}
}
