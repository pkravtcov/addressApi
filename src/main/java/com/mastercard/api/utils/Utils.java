package com.mastercard.api.utils;

import java.util.List;
import java.util.Random;
import org.apache.commons.lang3.RandomStringUtils;

public class Utils {
	
	public static Integer generateIntNumber(int maxLimit) {
		return new Random().nextInt(maxLimit);
	}
	
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
	
	public static Object getRandomListElement(List inputList) {
		Random random = new Random();
		return inputList.get(random.nextInt(inputList.size()));
	}
	
	public static String generateAlphanumericString(Integer maxNumber, Integer numberOfLetters) {
		Integer number = generateIntNumber(maxNumber);
		String randomLetter = RandomStringUtils.randomAlphabetic(numberOfLetters).toUpperCase();
		return number + randomLetter;	
	}
	
}
