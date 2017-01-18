package org.apache.el.parser;

import org.apache.el.parser.TestELParser;

public class MainForTestELParser_testBug49081 {
	public static void main(String[] args) {
		try {
			new TestELParser().testBug49081();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}