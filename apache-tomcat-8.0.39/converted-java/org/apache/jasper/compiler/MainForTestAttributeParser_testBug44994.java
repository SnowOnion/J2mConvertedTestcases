package org.apache.jasper.compiler;

import org.apache.jasper.compiler.TestAttributeParser;

public class MainForTestAttributeParser_testBug44994 {
	public static void main(String[] args) {
		try {
			new TestAttributeParser().testBug44994();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}