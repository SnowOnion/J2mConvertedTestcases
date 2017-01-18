package org.apache.jasper.compiler;

import org.apache.jasper.compiler.TestParser;

public class MainForTestParser_testBug49297NoSpaceStrict {
	public static void main(String[] args) {
		try {
			new TestParser().testBug49297NoSpaceStrict();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}