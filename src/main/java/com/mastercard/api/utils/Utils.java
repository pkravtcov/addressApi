package com.mastercard.api.utils;

import java.util.List;
import java.util.Random;
import org.apache.commons.lang3.RandomStringUtils;

/**
 * Utilities class with helpful functions
 * 
 * @author Pavel Kravtcov
 *
 */
public class Utils {
	
	/**
	 * Generates random integer in specified bound
	 * 
	 * @param the upper bound which is used to generate random integer
	 * @return random Integer number
	 */
	public static Integer generateIntNumber(int maxLimit) {
		return new Random().nextInt(maxLimit);
	}
	
	/**
	 * Generates six digit number
	 * 
	 * @param the upper bound which is used to generate random integer
	 * @return six digit number in String format
	 */
	public static String generateSixDigitNumericCode(int maxLimit) {
		String randomInt = String.valueOf(generateIntNumber(maxLimit));
		StringBuilder sb = new StringBuilder(randomInt);
		while (randomInt.length() < 6) {
			sb.insert(0, 0);
			randomInt = sb.toString();
		}
		
		if (randomInt.length() > 6) {
			randomInt = randomInt.substring(0, 6);
		}
		return randomInt;
		
	}
	
	/**
	 * Gets random element from input list
	 * 
	 * @param list
	 * @return object from a list
	 */
	public static Object getRandomListElement(List inputList) {
		Random random = new Random();
		return inputList.get(random.nextInt(inputList.size()));
	}
	
	/**
	 * Generates alphanumeric String
	 * 
	 * @param the upper bound which is used to generate random integer
	 * @param number of letters to be added in the end of the string
	 * @return number and letters string
	 */
	public static String generateAlphanumericString(Integer maxNumber, Integer numberOfLetters) {
		Integer number = generateIntNumber(maxNumber);
		String randomLetter = RandomStringUtils.randomAlphabetic(numberOfLetters).toUpperCase();
		return number + randomLetter;	
	}
	
}
