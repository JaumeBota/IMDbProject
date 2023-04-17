package com.traingft.imdb;

import static org.mockito.Mockito.verify;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.mockito.Mock;
import org.springframework.boot.SpringApplication;

@SpringBootTest
class ImDbProjectApplicationTests {

	@Mock
	SpringApplication mockApplication;
	
	
	@Test
	void contextLoads() {
	}

	@Test
    public void testMainMethod() {
        ImDbProjectApplication.main(new String[] {"arg1", "arg2"}, mockApplication);
        verify(mockApplication).getApplicationStartup();
        SpringApplication.run(ImDbProjectApplication.class, "arg1", "arg2");
    }
	
}
