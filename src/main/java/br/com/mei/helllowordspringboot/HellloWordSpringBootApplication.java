package br.com.mei.helllowordspringboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class HellloWordSpringBootApplication {

	public static void main(String[] args) {
		SpringApplication.run(HellloWordSpringBootApplication.class, args);
	}
	
	@GetMapping("/ola-mundo")
	public String helloWorld(@RequestParam(value = "nameUser", defaultValue = 
			"Mundo!")String nameUser){
		return String.format("Olá %s", nameUser);
	}

}
