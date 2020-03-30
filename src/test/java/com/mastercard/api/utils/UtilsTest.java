package com.mastercard.api.utils;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.regex.Pattern;

import org.junit.Test;

public class UtilsTest {
	
	@Test
	public void whenThereAreLessThanSixDigitsThenAddAdditionalZerosToTheBegining() {
		String sixDigitCode = Utils.generateSixDigitNumericCode(9);
		String firstFiveCharacters = sixDigitCode.substring(0, sixDigitCode.length() - 1);
		assertEquals("00000", firstFiveCharacters);
	}
	
	@Test
	public void whenThereMoreThanSixDigitsLimitThenSixDigitCodeLengthIsReturned() {
		String sixDigitCode = Utils.generateSixDigitNumericCode(999999999);
		assertEquals(6, sixDigitCode.length());
	}
	
	@Test
	public void verifyThatStringIsAlphanumeric() {
		Pattern pattern = Pattern.compile("^[a-zA-Z0-9]*$");
		String generatedString = Utils.generateAlphanumericString(789, 5);
		assertTrue(pattern.matcher(generatedString).matches());
	}

}
