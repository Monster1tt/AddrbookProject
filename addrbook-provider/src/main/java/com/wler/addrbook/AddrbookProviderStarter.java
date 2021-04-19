package com.wler.addrbook;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * <b>Addrbook Provider 启动类</b>
 * @author Monster
 * @version 5.0.0
 */
@MapperScan("com.wler.addrbook.dao")
@EnableEurekaClient
@SpringBootApplication
public class AddrbookProviderStarter {
	public static void main(String[] args) {
		SpringApplication.run(AddrbookProviderStarter.class,args);
	}
}
