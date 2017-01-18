package org.apache.jasper.compiler;

import org.apache.jasper.compiler.TestAttributeParser;

public class MainForTestAttributeParser_testBug49081 {
	public static void main(String[] args) {
		try {
			new TestAttributeParser().testBug49081();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}