package org.apache.el.parser;

import org.apache.el.parser.TestELParser;

public class MainForTestELParser_bug56185 {
	public static void main(String[] args) {
		try {
			new TestELParser().bug56185();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}