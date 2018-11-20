package org.fornever.swift.models.mt940;

import java.util.ArrayList;
import java.util.List;

import org.fornever.swift.models.SwiftObject;
import org.fornever.swift.models.SwiftObjectType;

/**
 * Swift Object Document
 * 
 * @author Theo Sun
 *
 */
public class MT940Document extends SwiftObject {

	private MT940HeaderBlock header = new MT940HeaderBlock();

	private List<MT940TransactionBlock> transactions = new ArrayList<>();

	private MT940FinalBlock finalBlock = new MT940FinalBlock();

	@Override
	public SwiftObjectType getSwiftObjectType() {
		return SwiftObjectType.DOCUMENT;
	}

}
