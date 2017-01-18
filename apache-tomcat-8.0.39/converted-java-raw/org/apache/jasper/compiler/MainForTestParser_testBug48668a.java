package org.apache.jasper.compiler;

import org.apache.jasper.compiler.TestParser;

public class MainForTestParser_testBug48668a {
	public static void main(String[] args) {
		try {
			new TestParser().testBug48668a();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}