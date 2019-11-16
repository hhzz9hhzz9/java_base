package com.woniu.ch16.homework;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.OffsetDateTime;
import java.time.ZoneOffset;
import java.util.Date;

import org.junit.Test;

public class Homework2 {
	@Test
	public void hw1() throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat();
		sdf = new SimpleDateFormat("yyyy-MM-dd");
		String str = "2019-10-10";
		Date parse = sdf.parse(str);
		java.sql.Date date = new java.sql.Date(parse.getTime());
		System.out.println(date);
	}

	@Test
	public void hw2() {
		Instant instant = Instant.now();
		OffsetDateTime atOffset = instant.atOffset(ZoneOffset.ofHours(8));
		Long milli = atOffset.toEpochSecond();
		long days = milli / (24 * 60 * 60);
		if (days % 5 == 0 || days % 5 == 4) {
			System.out.println("今天晒网");
		} else {
			System.out.println("今天打渔");
		}
	}
}
