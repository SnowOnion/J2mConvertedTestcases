package org.apache.jasper.compiler;

import org.apache.jasper.compiler.TestELParser;

public class MainForTestELParser_testLiteral {
	public static void main(String[] args) {
		try {
			new TestELParser().testLiteral();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}