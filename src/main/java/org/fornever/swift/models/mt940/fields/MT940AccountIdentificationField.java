package org.fornever.swift.models.mt940.fields;

import org.fornever.swift.models.SwiftObject;
import org.fornever.swift.models.SwiftObjectType;

public class MT940AccountIdentificationField extends SwiftObject {

	private String fieldName = "25";

	private String content;

	@Override
	public String toString() {
		return String.format(":%s:%s", fieldName, content);
	}

	@Override
	public SwiftObjectType getSwiftObjectType() {
		return SwiftObjectType.FIELD;
	}

}
