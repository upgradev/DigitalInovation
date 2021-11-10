package br.com.globallabs.exemplomaven;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ExemploMavenApplication {

	public static void main(String[] args) {
		var teste = "ola";
		System.out.println("teste: " + teste);

		SpringApplication.run(ExemploMavenApplication.class, args);
	}

}
