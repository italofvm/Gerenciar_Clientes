package br.com.projeto.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;


@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class ApiGerenciadorApplication {


	public static void main(String[] args) {
		SpringApplication.run(ApiGerenciadorApplication.class, args);
	}

}
