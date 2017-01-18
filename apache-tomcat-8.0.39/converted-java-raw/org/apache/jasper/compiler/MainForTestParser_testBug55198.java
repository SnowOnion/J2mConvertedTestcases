package org.apache.jasper.compiler;

import org.apache.jasper.compiler.TestParser;

public class MainForTestParser_testBug55198 {
	public static void main(String[] args) {
		try {
			new TestParser().testBug55198();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}