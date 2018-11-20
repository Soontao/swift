package org.fornever.swift.models;

public enum SwiftBalanceType {

	Credit("C"), Debit("D");

	private String value;

	/**
	 * @param value
	 */
	private SwiftBalanceType(String value) {
		this.value = value;
	}

	public String getValue() {
		return value;
	}

	public static SwiftBalanceType fromString(String type) {
		switch (type) {
		case "D":
			return SwiftBalanceType.Debit;
		case "C":
			return SwiftBalanceType.Credit;
		default:
			return null;
		}
	}

}
