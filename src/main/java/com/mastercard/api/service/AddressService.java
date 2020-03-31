package com.mastercard.api.service;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.mastercard.api.products.Address;
import com.mastercard.api.utils.Utils;

/**
 * the type Address service
 * 
 * @author Pavel Kravtcov
 *
 */
@Service
public class AddressService {
	
	private final Logger logger = LoggerFactory.getLogger(AddressService.class);
	private Map<String, String> countryCodesMap = getCountryCodesMap();
	private List<String> streets = Arrays.asList("Walter St.", "Hoyt St.", "95th St.", "Wall St.");
	private List<String> cities = Arrays.asList("Stamford", "New York", "Jersey City", "Philadelphia");
	private List<String> counties = Arrays.asList("Fairfield", "Westchester", "Camden", "Hudson");
	private List<String> states = Arrays.asList("Connecticut", "New York", "New Jersey", "Pennsylvania");
	private List<String> stateCodes = Arrays.asList("CT", "NY", "NJ", "PA");
	private List<String> countries = Arrays.asList("US", "Canada", "Mexico", "Netherlands");
	
	public static final Integer MAX_LETTERS_IN_APARTMENT_NUMBER = 1;
	public static final Integer MAX_INT_IN_APARTMENT_NUMBER = 99;
	public static final Integer MAX_HOUSE_NUMBER = 1999;
	public static final Integer MAX_POSTAL_CODE_NUMBER = 999999;
	
	
	/**
	 * Generates random address
	 * 
	 * @return address
	 */
	public Address getRandomAddress() {
		String house = String.valueOf(Utils.generateIntNumber(MAX_HOUSE_NUMBER));
		String street = (String) Utils.getRandomListElement(streets);
		String apartmentNumber = Utils.generateAlphanumericString(MAX_INT_IN_APARTMENT_NUMBER, MAX_LETTERS_IN_APARTMENT_NUMBER);
		String postalCode = Utils.generateSixDigitNumericCode(MAX_POSTAL_CODE_NUMBER);
		String city = (String) Utils.getRandomListElement(cities);
		String county = (String) Utils.getRandomListElement(counties);
		Optional<String> state = Optional.of((String) Utils.getRandomListElement(states));
		Optional<String> stateCode = Optional.of((String) Utils.getRandomListElement(stateCodes));
		Optional<String> country = Optional.of((String) Utils.getRandomListElement(countries));
		
		Address randomAddress = new Address(house, street, apartmentNumber, postalCode,
				city, county, state, stateCode, country, countryCodesMap.get(country.get()));	
		logger.info("Address is: " + randomAddress.toString());
		
		return randomAddress;	
	}
	
	/**
	 * Builds a map of countries and their country codes
	 * 
	 * @return country codes map
	 */
	private Map<String, String> getCountryCodesMap() {
		Map<String, String> countryCodes = new HashMap<>();
		countryCodes.put("US", "USA");
		countryCodes.put("Canada", "CAN");
		countryCodes.put("Mexico", "MEX");
		countryCodes.put("Netherlands", "NLD");
		
		return countryCodes;
	}
	
	
	

}
