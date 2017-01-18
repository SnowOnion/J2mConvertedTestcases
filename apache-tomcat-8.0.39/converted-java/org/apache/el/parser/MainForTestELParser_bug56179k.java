package org.apache.el.parser;

import org.apache.el.parser.TestELParser;

public class MainForTestELParser_bug56179k {
	public static void main(String[] args) {
		try {
			new TestELParser().bug56179k();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}