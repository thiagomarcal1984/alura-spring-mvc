package br.com.alura.mvc.mudi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MudiApplication {

	public static void main(String[] args) {
		SpringApplication.run(MudiApplication.class, args);
		// O arquivo application.properties tem uma propriedade que define
		// a porta que vai ser usada ao rodar o Spring Boot:
		// 		server.port: 80
	}

}
