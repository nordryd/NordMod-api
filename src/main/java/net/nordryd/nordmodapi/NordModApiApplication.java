package net.nordryd.nordmodapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication
public class NordModApiApplication
{
	public static void main(String[] args) {
		SpringApplication.run(NordModApiApplication.class, args);
	}

	@GetMapping
	public String apiRoot(){
		return "Hello, world!";
	}
}
