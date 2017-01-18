package org.apache.jasper.compiler;

import org.apache.jasper.compiler.TestParser;

public class MainForTestParser_testBug56265 {
	public static void main(String[] args) {
		try {
			new TestParser().testBug56265();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}