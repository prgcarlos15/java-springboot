package br.com.javaspringboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class JavaSpringbootApplication {

	@GetMapping("/")
	public String test() {
		return "deu certo";
	}
	
	@GetMapping("/{variable}")
	public String testInput(@PathVariable String meuInput) {
		return "PSC: " + meuInput + " passa pro próximo";
	}
	
	public static void main(String[] args) {
		SpringApplication.run(JavaSpringbootApplication.class, args);
	}

}
