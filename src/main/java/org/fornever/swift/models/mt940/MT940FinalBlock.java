package org.fornever.swift.models.mt940;

import java.text.ParseException;
import org.fornever.swift.models.SwiftBalance;
import org.fornever.swift.models.SwiftObject;
import org.fornever.swift.models.SwiftObjectType;
import org.fornever.swift.models.mt940.fields.MT940ClosingBalanceField;

/**
 * MT940FinalBlock
 * 
 * parse & format final block like: :62M:C180516CNY1260448,94\r\n-}\r\n content
 * 
 * @author Theo Sun
 *
 */
public class MT940FinalBlock extends SwiftObject {

	private MT940ClosingBalanceField closingBalanceField;

	public MT940ClosingBalanceField getClosingBalanceField() {
		return closingBalanceField;
	}

	public void setClosingBalanceField(MT940ClosingBalanceField closingBalanceField) {
		this.closingBalanceField = closingBalanceField;
	}

	@Override
	public SwiftObjectType getSwiftObjectType() {
		return SwiftObjectType.BLOCK;
	}

	@Override
	public String toString() {
		return String.format("%s\r\n-}\r\n", this.closingBalanceField.toString());
	}

	public static MT940FinalBlock fromString(String balanceString) throws ParseException {
		MT940FinalBlock rt = new MT940FinalBlock();
		assert balanceString.substring(1, 3).equals("62");
		String fieldString = balanceString.substring(0, balanceString.indexOf("\r\n"));
		rt.setClosingBalanceField(MT940ClosingBalanceField.fromString(fieldString));
		return rt;
	}

}
