package org.fornever.swift.models.mt940;

import org.fornever.swift.models.SwiftObject;
import org.fornever.swift.models.SwiftObjectType;

public class MT940TransactionBlock extends SwiftObject {
	
	@Override
	public SwiftObjectType getSwiftObjectType() {
		return SwiftObjectType.BLOCK;
	}
	
}
