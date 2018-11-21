package org.fornever.swift.models.mt940;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.fornever.swift.models.SwiftObject;
import org.fornever.swift.models.SwiftObjectType;

/**
 * Swift Object Document
 * 
 * @author Theo Sun
 */
public class MT940Document extends SwiftObject {

	private static Pattern mt940Regex = Pattern.compile(
			"\\{(1:.*?)\\}\\{(2:.*?)\\}(.*?)(\\{4:[\\r]?\\n)(:20:.*?[\\r]?[\\n])(:25:.*?[\\r]?\\n)(:28C:.*?[\\r]?[\\n])(:60.:.*?[\\r]?[\\n])(((:61:.*?[\\r]?[\\n])([^:].*?[\\r]?[\\n]){0,1}(:86:.*?[\\r]?[\\n])([^:].*?[\\r]?[\\n]){0,5})+)(:62.:.*?[\\r]?[\\n]-\\})[\\r]?[\\n]");

	public static List<MT940Document> fromString(String input) {
		List<MT940Document> rt = new ArrayList<>();
		Matcher matcher = mt940Regex.matcher(input);
		while (matcher.find()) {

			String fieldOne = matcher.group(1);
			String fieldTwo = matcher.group(2);
			String addtionalField = matcher.group(3);
			String fieldFour = matcher.group(4);
			String reference = matcher.group(5);
			String accountIdentification = matcher.group(6);
			String statementNumAndSequence = matcher.group(7);
			String openingBalance = matcher.group(8);
			String transactionInfos = matcher.group(9);
			String finalBlock = matcher.group(matcher.groupCount());

		}
		return rt;
	}

	private MT940HeaderBlock header = new MT940HeaderBlock();

	private List<MT940TransactionBlock> transactions = new ArrayList<>();

	private MT940FinalBlock finalBlock = new MT940FinalBlock();

	public MT940FinalBlock getFinalBlock() {
		return finalBlock;
	}

	public MT940HeaderBlock getHeader() {
		return header;
	}

	@Override
	public SwiftObjectType getSwiftObjectType() {
		return SwiftObjectType.DOCUMENT;
	}

	public List<MT940TransactionBlock> getTransactions() {
		return transactions;
	}

	public void setFinalBlock(MT940FinalBlock finalBlock) {
		this.finalBlock = finalBlock;
	}

	public void setHeader(MT940HeaderBlock header) {
		this.header = header;
	}

	public void setTransactions(List<MT940TransactionBlock> transactions) {
		this.transactions = transactions;
	}

}
