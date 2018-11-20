package org.fornever.swift.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtil {

	private static SimpleDateFormat formatter = new SimpleDateFormat("yyMMdd");

	public static Date parseSwiftDate(String dateString) throws ParseException {
		return formatter.parse(dateString);
	}

	public static String swiftDateFormat(Date date) {
		return formatter.format(date);
	}

}
