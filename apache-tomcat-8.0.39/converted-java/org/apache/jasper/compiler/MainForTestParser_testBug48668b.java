package org.apache.jasper.compiler;

import org.apache.jasper.compiler.TestParser;

public class MainForTestParser_testBug48668b {
	public static void main(String[] args) {
		try {
			new TestParser().testBug48668b();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}