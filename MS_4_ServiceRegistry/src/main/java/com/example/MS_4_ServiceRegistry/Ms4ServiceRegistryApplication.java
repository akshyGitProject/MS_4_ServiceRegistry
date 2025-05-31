package com.example.MS_4_ServiceRegistry;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class Ms4ServiceRegistryApplication {

	public static void main(String[] args) {
		SpringApplication.run(Ms4ServiceRegistryApplication.class, args);
	}

}
