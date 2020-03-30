package com.mastercard.api.products;


public class Address {
	
	private String house;
	private String street;
	private String apartmentNumber;
	private String postalCode;
	private String city;
	private String county;
	private String state;
	private String stateCode;
	private String country;
	private String countryCode;
	
	public Address (String house, String street, String apartmentNumber, 
			String postalCode, String city, String county,String state, 
			String stateCode, String country, String countryCode) {	
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
	
	public String getState() {
		return state;
	}
	
	public String getStateCode() {
		return stateCode;
	}
	
	public String getCountry() {
		return country;
	}
	
	public String getCountryCode() {
		return countryCode;
	}
	
	@Override
	public String toString() {
		return this.house + " " + this.street + ", Apt. " + this.apartmentNumber 
				+ ", " + this.city + ", " + this.state + ", " + this.postalCode;
	}
}
