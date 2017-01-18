package org.apache.jasper.compiler;

import org.apache.jasper.compiler.TestAttributeParser;

public class MainForTestAttributeParser_testBug42565 {
	public static void main(String[] args) {
		try {
			new TestAttributeParser().testBug42565();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}