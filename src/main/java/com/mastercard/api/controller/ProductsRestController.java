package com.mastercard.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mastercard.api.products.Address;
import com.mastercard.api.service.AddressService;




@RestController 
public class ProductsRestController {
	
	@Autowired
	AddressService addressService;
	
	@GetMapping("/randomizer/address")
	public Address getRandomAddress() {
		return addressService.getRandomAddress();
	}

}
 