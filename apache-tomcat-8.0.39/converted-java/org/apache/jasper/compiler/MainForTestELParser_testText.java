package org.apache.jasper.compiler;

import org.apache.jasper.compiler.TestELParser;

public class MainForTestELParser_testText {
	public static void main(String[] args) {
		try {
			new TestELParser().testText();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}