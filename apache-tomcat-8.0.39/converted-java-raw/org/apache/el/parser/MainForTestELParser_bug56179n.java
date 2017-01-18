package org.apache.el.parser;

import org.apache.el.parser.TestELParser;

public class MainForTestELParser_bug56179n {
	public static void main(String[] args) {
		try {
			new TestELParser().bug56179n();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}