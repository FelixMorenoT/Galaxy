package com.galaxy;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.galaxy.entity.Astronaut;

@SpringBootTest()
class GalaxyApiApplicationTests {

	protected MockMvc mvc;
	
	@Autowired
	private TestRestTemplate restTemplate;
	
	private  ObjectMapper Obj = new ObjectMapper(); 
	
	@Test
	public void testCreateAstronauts() {
		String uri = "/astronaut";
		Astronaut temp = new Astronaut(1, "Felix", "Moreno", "25", "160", "80", "Masculino", "14/05/1995", "O+");

			   
	}

}
