package com.cui.conversionServiceTest;

import org.springframework.core.convert.support.DefaultConversionService;

public class ConversionServiceTest {
	public static void main(String[] args) {
		DefaultConversionService conversionService = new DefaultConversionService();
		if (conversionService.canConvert(String.class, Integer.class)) {
			System.out.println("String to Boolean result : " + conversionService.convert("true", Boolean.class));
		}

		if (conversionService.canConvert(String.class, Integer.class)) {
			System.out.println("String to Integer result : " + conversionService.convert("1", Integer.class));
		}
	}
}
