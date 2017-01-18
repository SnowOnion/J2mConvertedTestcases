package org.apache.jasper.compiler;

import org.apache.jasper.compiler.TestValidator;

public class MainForTestValidator_testBug47331 {
	public static void main(String[] args) {
		try {
			new TestValidator().testBug47331();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}