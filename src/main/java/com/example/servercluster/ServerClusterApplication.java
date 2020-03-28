package com.example.servercluster;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class ServerClusterApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServerClusterApplication.class, args);
	}

}
