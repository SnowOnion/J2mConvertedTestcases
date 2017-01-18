package org.apache.jasper.compiler;

import org.apache.jasper.compiler.TestParser;

public class MainForTestParser_testBug56334And56561 {
	public static void main(String[] args) {
		try {
			new TestParser().testBug56334And56561();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}