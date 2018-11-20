package org.fornever.swift.models;

import java.text.ParseException;
import java.util.Currency;

import org.fornever.swift.util.DateUtil;
import org.junit.Test;

public class SwiftBalanceTest {

	@Test
	public void testToString() throws ParseException {
		SwiftBalance balance = new SwiftBalance();
		balance.setAmount("14188,46");
		balance.setCurrency(Currency.getInstance("CNY"));
		balance.setType(SwiftBalanceType.Debit);
		balance.setDate(DateUtil.parseSwiftDate("181120"));
		assert balance.toString().equals("D181120CNY14188,46");
	}

	@Test
	public void testFromString() throws ParseException {
		assert SwiftBalance.fromString("D181120CNY14188,46").toString().equals("D181120CNY14188,46");
	}

}
