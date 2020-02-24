package de.tutorialmicroservices.blog.welcome;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class WelcomeController {

	@CrossOrigin(origins = "http://localhost:4200")
	@RequestMapping("/")
	public String index() {
		return "Willkommen im Microservices-Tutorial!";
	}

}
