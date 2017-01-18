package org.apache.el.parser;

import org.apache.el.parser.TestELParser;

public class MainForTestELParser_bug56179c {
	public static void main(String[] args) {
		try {
			new TestELParser().bug56179c();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}