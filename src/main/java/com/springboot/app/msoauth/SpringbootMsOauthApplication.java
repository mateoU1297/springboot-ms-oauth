package com.springboot.app.msoauth;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class SpringbootMsOauthApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootMsOauthApplication.class, args);
	}

}
