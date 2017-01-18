package org.apache.jasper.compiler;

import org.apache.jasper.compiler.TestParser;

public class MainForTestParser_testBug48627 {
	public static void main(String[] args) {
		try {
			new TestParser().testBug48627();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}