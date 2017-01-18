package org.apache.el.parser;

import org.apache.el.parser.TestELParser;

public class MainForTestELParser_bug56179l {
	public static void main(String[] args) {
		try {
			new TestELParser().bug56179l();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}