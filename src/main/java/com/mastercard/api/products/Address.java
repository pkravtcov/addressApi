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
	

	public String getHouse() {
		return house;
	}
	
	public String getStreet() {
		return street;
	}
	
	public String getApartmentNumber() {
		return apartmentNumber;
	}
	
	public String getPostalCode() {
		return postalCode;
	}
	
	public String getCity() {
		return city;
	}
	
	public String getCounty() {
		return county;
	}
	
	public Optional<String> getState() {
		return state;
	}
	
	public Optional<String> getStateCode() {
		return stateCode;
	}
	
	public Optional<String> getCountry() {
		return country;
	}
	
	public String getCountryCode() {
		return countryCode;
	}
	
	@Override
	public String toString() {
		return this.house + " " + this.street + ", Apt. " + this.apartmentNumber 
				+ ", " + this.city + ", " + this.state.get() + ", " + this.postalCode;
	}
}
