# addressApi
Api generates random address. Built on Spring boot. 

# Getting Started

## Pre-requisites
Make sure you built the project with "mvn clean install" command and the result is success.

## Usage
Main class you need to run as Java application is /src/main/java/com/mastercard/api/AddressChangeMain.java.

Open your web browser and enter to address bar: http://localhost:7071/randomizer/address
Each time you refresh the web page you get a new example of a random address.

##Logging
You can see a random generated address in log file /address-api.log:
c.mastercard.api.service.AddressService  : Address is: 335 Hoyt St., Apt. 55M, New York, New York, 680267

And how much time it took to generate an address: c.m.a.controller.ProductsRestController  : Address api request took 634767 nanosecond(s)

### Output Example
{"house":"58","street":"95th St.","apartmentNumber":"94N","postalCode":"500706","city":"New York","county":"Westchester","state":"New York","stateCode":"NY","country":"US","countryCode":"USA"}

## Solution
Main logic is located here: 
com.mastercard.api.service.AddressService.getRandomAddress()

Logic generates numbers for house, apartmentNumber, postalCode based on the requirements 
and randomly picks item from each list for:

private List<String> streets = Arrays.asList("Walter St.", "Hoyt St.", "95th St.", "Wall St.");
	private List<String> cities = Arrays.asList("Stamford", "New York", "Jersey City", "Philadelphia");
	private List<String> counties = Arrays.asList("Fairfield", "Westchester", "Camden", "Hudson");
	private List<String> states = Arrays.asList("Connecticut", "New York", "New Jersey", "Pennsylvania");
	private List<String> stateCodes = Arrays.asList("CT", "NY", "NJ", "PA");
	private List<String> countries = Arrays.asList("US", "Canada", "Mexico", "Netherlands");	


Country code is received from Country codes map:
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
		