package org.fornever.swift.models.mt940;

import org.fornever.swift.models.SwiftObject;
import org.fornever.swift.models.SwiftObjectType;

public class MT940FinalBlock extends SwiftObject {

	private Boolean isFinal = false;

	public Boolean getIsFinal() {
		return isFinal;
	}

	@Override
	public SwiftObjectType getSwiftObjectType() {
		return SwiftObjectType.BLOCK;
	}

	public void setIsFinal(Boolean isFinal) {
		this.isFinal = isFinal;
	}

}
