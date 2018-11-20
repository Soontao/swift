package org.fornever.swift.models.mt940;

import org.fornever.swift.models.SwiftObject;
import org.fornever.swift.models.SwiftObjectType;

public class MT940HeaderBlock extends SwiftObject {
	
	private SwiftObject fieldOne;
	private SwiftObject fieldTwo;
	private SwiftObject reference;
	private SwiftObject accountIdentification;
	private SwiftObject statemenNumber;
	private SwiftObject openingBalance;

	@Override
	public SwiftObjectType getSwiftObjectType() {
		return SwiftObjectType.BLOCK;
	}

}
