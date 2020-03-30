package com.mastercard.api.integration;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;

import com.mastercard.api.AddressChangeMain;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = AddressChangeMain.class, webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class AddressIT {
	
	@Autowired
	private TestRestTemplate testTemplate;
	
	@LocalServerPort
	private int port;
	
	private String getDefaultUrl() {
		return "http://localhost:" + port;
	}
	
	@Test
	public void whenCallRandomizerAddressApiThenAddressIsGenerated() {
		HttpEntity<String> entity = new HttpEntity<String>(null, new HttpHeaders());
		ResponseEntity<String> response = testTemplate.exchange(getDefaultUrl() + "/randomizer/address",
				HttpMethod.GET, entity, String.class);
		
		assertNotNull("Response should not be empty or null", response.getBody());
		assertEquals("200 OK", response.getStatusCode().toString());
		
	}

}
