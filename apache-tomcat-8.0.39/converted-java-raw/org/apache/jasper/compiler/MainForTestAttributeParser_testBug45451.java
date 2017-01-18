package org.apache.jasper.compiler;

import org.apache.jasper.compiler.TestAttributeParser;

public class MainForTestAttributeParser_testBug45451 {
	public static void main(String[] args) {
		try {
			new TestAttributeParser().testBug45451();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}