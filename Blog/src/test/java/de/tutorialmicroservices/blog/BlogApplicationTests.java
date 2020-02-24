package de.tutorialmicroservices.blog;

import static org.hamcrest.Matchers.equalTo;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.Test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

@SpringBootTest
@AutoConfigureMockMvc
class BlogApplicationTests {
	/**
	 * The welcome text that should be returned on index page.
	 */
	private static final String WELCOME_TEXT = "Willkommen im Microservices-Tutorial!";
	
	/**
	 * A mock to perform server requests.
	 */
	@Autowired
	private MockMvc mvc;

	/**
	 * Performs a request for the root index page and checks if a successful
	 * response is given where we are greeted with the welcome text of
	 * {@link WELCOME_TEXT}.
	 * 
	 * @throws Exception
	 */
	@Test
	public void getGreetingText() throws Exception {
		mvc.perform(MockMvcRequestBuilders.get("/").accept(MediaType.APPLICATION_JSON)).andExpect(status().isOk())
				.andExpect(content().string(equalTo(WELCOME_TEXT)));
	}
}
