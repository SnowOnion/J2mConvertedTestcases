package org.apache.el.parser;

import org.apache.el.parser.TestELParser;

public class MainForTestELParser_bug56179f {
	public static void main(String[] args) {
		try {
			new TestELParser().bug56179f();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}