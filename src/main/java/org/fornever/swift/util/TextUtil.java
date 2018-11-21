package org.fornever.swift.util;

import java.util.regex.Pattern;

public class TextUtil {


	public static String convertLFToCRLF(String input) {

		if (input.indexOf("\r\n") > 0) {
			return input.replaceAll("\n", "\r\n");
		} else {
			return input;
		}

	}

}
