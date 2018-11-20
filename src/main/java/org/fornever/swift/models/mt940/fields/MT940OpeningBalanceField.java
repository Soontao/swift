package org.fornever.swift.models.mt940.fields;

import java.text.ParseException;

import org.fornever.swift.models.SwiftBalance;
import org.fornever.swift.models.SwiftObject;
import org.fornever.swift.models.SwiftObjectType;

public class MT940OpeningBalanceField extends SwiftObject {

	private String fieldName = "60";
	private SwiftBalance balance = new SwiftBalance();
	private Boolean isFinal = false;

	public SwiftBalance getBalance() {
		return balance;
	}

	public Boolean getIsFinal() {
		return isFinal;
	}

	public void setBalance(SwiftBalance balance) {
		this.balance = balance;
	}

	public void setIsFinal(Boolean isFinal) {
		this.isFinal = isFinal;
	}

	@Override
	public SwiftObjectType getSwiftObjectType() {
		return SwiftObjectType.FIELD;
	}

	@Override
	public String toString() {
		return String.format(":%s%s:%s", this.fieldName, this.isFinal ? "F" : "M", this.balance.toString());
	}

	public static MT940OpeningBalanceField fromString(String balanceString) throws ParseException {
		MT940OpeningBalanceField rt = new MT940OpeningBalanceField();
		assert balanceString.substring(1, 3).equals("62");
		rt.setIsFinal(balanceString.substring(3, 4).equals("F"));
		String valueString = balanceString.substring(5);
		rt.setBalance(SwiftBalance.fromString(valueString));
		return rt;
	}

}
