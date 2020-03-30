package com.mastercard.api.utils;

import static org.junit.jupiter.api.Assertions.assertEquals;

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

}
