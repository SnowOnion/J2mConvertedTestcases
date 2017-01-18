package org.apache.jasper.compiler;

import org.apache.jasper.compiler.TestELParser;

public class MainForTestELParser_testVariable {
	public static void main(String[] args) {
		try {
			new TestELParser().testVariable();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}