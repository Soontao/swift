package org.fornever.swift.models.mt942;

import org.fornever.swift.models.SwiftObject;
import org.fornever.swift.models.SwiftObjectType;

public class MT942Document extends SwiftObject {

	@Override
	public SwiftObjectType getSwiftObjectType() {
		return SwiftObjectType.DOCUMENT;
	}

}
