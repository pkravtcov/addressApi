package com.mastercard.api.products;

import java.util.Optional;

public class Address {
	
	private String house;
	private String street;
	private String apartmentNumber;
	private String postalCode;
	private String city;
	private String county;
	private Optional<String> state;
	private Optional<String> stateCode;
	private Optional<String> country;
	private String countryCode;
	
	public Address (String house, String street, String apartmentNumber, 
			String postalCode, String city, String county,Optional<String> state, 
			Optional<String> stateCode, Optional<String> country, String countryCode) {	
		this.house = house;
		this.street = street;
		this.apartmentNumber = apartmentNumber;
		this.postalCode = postalCode;
		this.city = city;
		this.county = county;
		this.state = state;
		this.stateCode = stateCode;
		this.country = country;
		this.countryCode = countryCode;
	}
	
	/**
	 * Gets house number
	 * 
	 * @return house
	 */
	public String getHouse() {
		return house;
	}
	
	/**
	 * Gets street name
	 * 
	 * @return street name
	 */
	public String getStreet() {
		return street;
	}
		
	/**
	 * Gets apartment number
	 * 
	 * @return the apartment number
	 */
	public String getApartmentNumber() {
		return apartmentNumber;
	}
	
	/**
	 * Gets postal code
	 * 
	 * @return the postal code
	 */
	public String getPostalCode() {
		return postalCode;
	}
	
	/**
	 * Gets city
	 * 
	 * @return the city name
	 */
	public String getCity() {
		return city;
	}
	
	/**
	 * Gets county name
	 * 
	 * @return the county
	 */
	public String getCounty() {
		return county;
	}
	
	/**
	 * Gets state name
	 * 
	 * @return the state
	 */
	public Optional<String> getState() {
		return state;
	}
	
	/**
	 * Gets state code
	 * 
	 * @return the state code
	 */
	public Optional<String> getStateCode() {
		return stateCode;
	}
	
	/**
	 * Gets country name
	 * 
	 * @return the country
	 */
	public Optional<String> getCountry() {
		return country;
	}
	
	/**
	 * Gets country code
	 * 
	 * @return the country code
	 */
	public String getCountryCode() {
		return countryCode;
	}
	
	/**
	 * Gets address in the specified format
	 * 
	 * @return the address string
	 */
	@Override
	public String toString() {
		return this.house + " " + this.street + ", Apt. " + this.apartmentNumber 
				+ ", " + this.city + ", " + this.state.get() + ", " + this.postalCode;
	}
}
