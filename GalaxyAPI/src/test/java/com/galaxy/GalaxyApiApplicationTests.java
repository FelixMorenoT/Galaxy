package com.galaxy;

import static org.mockito.Mockito.when;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.boot.test.context.SpringBootTest;

import com.galaxy.entity.Astronaut;
import com.galaxy.rest.GalaxyRest;
import com.galaxy.services.AstronautService;

@SpringBootTest
class GalaxyApiApplicationTests {

	@InjectMocks
	GalaxyRest galaxyRest;
	
	@Mock
	AstronautService astronautService;
	
	@BeforeEach
	void setUp() throws Exception{
		MockitoAnnotations.initMocks(this);

	}
	
	@Test
	public void testCreateAnAstronaut() throws Exception {
		Astronaut tempAstronaut = new Astronaut("Felix", "Moreno", "25", "1.60cm", "80kg", "Masculino", "14/05/1995", "O+");
		when(astronautService.saveAstronaut(tempAstronaut)).thenReturn(true);
	
	}
	
	@Test
	public void testCreateAnAstronaut1() throws Exception {
		
		Astronaut tempAstronaut1 = new Astronaut();
		when(astronautService.saveAstronaut(tempAstronaut1)).thenReturn(false);
	}
}
