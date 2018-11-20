package org.fornever.swift.models.mt940;

import java.text.ParseException;

import org.junit.Test;

public class MT940FinalBlockTest {

	@Test
	public void testFromString() throws ParseException {
		String input = ":62F:C180516CNY1675396,94\r\n-}\r\n";
		assert MT940FinalBlock.fromString(input).toString().equals(input);
		input = ":62M:C180516CNY1260448,94\r\n-}\r\n";;
		assert MT940FinalBlock.fromString(input).toString().equals(input);
	}

}
