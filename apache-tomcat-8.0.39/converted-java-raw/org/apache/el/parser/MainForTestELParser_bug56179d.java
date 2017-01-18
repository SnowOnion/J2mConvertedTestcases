package org.apache.el.parser;

import org.apache.el.parser.TestELParser;

public class MainForTestELParser_bug56179d {
	public static void main(String[] args) {
		try {
			new TestELParser().bug56179d();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}