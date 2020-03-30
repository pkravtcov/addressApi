package com.mastercard.api.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mastercard.api.products.Address;
import com.mastercard.api.service.AddressService;

@RestController 
public class ProductsRestController {
	
	private final Logger logger = LoggerFactory.getLogger(ProductsRestController.class);
	
	@Autowired
	AddressService addressService;
	
	/**
	 * Gets random address
	 * 
	 * @return address
	 */
	@GetMapping("/randomizer/address")
	public Address getRandomAddress() {
		long requestStartTime = System.nanoTime();
		Address address = addressService.getRandomAddress();
		long requestEndTime = System.nanoTime();
		logger.info("Address api request took " + (requestEndTime - requestStartTime)
				+ " nanosecond(s)");
		return address;
	}

}
 