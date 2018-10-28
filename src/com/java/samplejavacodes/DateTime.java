package com.java.samplejavacodes;

import java.time.ZoneId;

public class DateTime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ZoneId.getAvailableZoneIds().stream()
		.filter(z -> z.contains("US") || z.contains("America"))
		.sorted().forEach(System.out::println);

	}

}
