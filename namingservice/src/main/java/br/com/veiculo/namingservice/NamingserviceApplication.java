package br.com.veiculo.namingservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class NamingserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(NamingserviceApplication.class, args);
	}

}
