package org.fornever.swift.models;

import java.text.ParseException;
import java.util.Currency;
import java.util.Date;

import org.fornever.swift.util.DateUtil;

public class SwiftBalance extends SwiftObject {

	private SwiftBalanceType type;

	private Currency currency;
	private Date date;
	private String amount;

	public String getAmount() {
		return amount;
	}

	public Currency getCurrency() {
		return currency;
	}

	public Date getDate() {
		return date;
	}

	@Override
	public SwiftObjectType getSwiftObjectType() {
		return SwiftObjectType.VALUE;
	}

	public SwiftBalanceType getType() {
		return type;
	}

	public void setAmount(String amount) {
		this.amount = amount;
	}

	public void setCurrency(Currency currency) {
		this.currency = currency;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public void setType(SwiftBalanceType type) {
		this.type = type;
	}

	@Override
	public String toString() {
		return String.format("%s%s%s%s", type.getValue(), DateUtil.swiftDateFormat(date), currency.getCurrencyCode(),
				this.amount);
	}

	public static SwiftBalance fromString(String balanceString) throws ParseException {
		SwiftBalance rt = new SwiftBalance();
		rt.setType(SwiftBalanceType.fromString(balanceString.substring(0, 1)));
		rt.setDate(DateUtil.parseSwiftDate(balanceString.substring(1, 7)));
		rt.setCurrency(Currency.getInstance(balanceString.substring(7, 10)));
		rt.setAmount(balanceString.substring(10));
		return rt;
	}

}
