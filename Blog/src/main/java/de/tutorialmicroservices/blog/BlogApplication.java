package de.tutorialmicroservices.blog;

import java.util.Arrays;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class BlogApplication {

	public static void main(String[] args) {
		SpringApplication.run(BlogApplication.class, args);
	}
	
	/**
	 * Prints out all beans found within the application context.
	 * 
	 * @param ctx	The application context holding the run configuration.
	 * @return	The cli-runner that prints beans from given {@link ctx}. 
	 */
	@Bean
	public CommandLineRunner printAllBeans(ApplicationContext ctx) {
		return args -> {

			System.out.println("Beans provided by Spring Boot Application:");

			var beanNames = ctx.getBeanDefinitionNames();
			
			Arrays.stream(beanNames).sorted().forEach(System.out::println);
		};
	}
}
