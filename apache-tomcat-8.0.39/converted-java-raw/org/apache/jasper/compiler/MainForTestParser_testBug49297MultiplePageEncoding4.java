package org.apache.jasper.compiler;

import org.apache.jasper.compiler.TestParser;

public class MainForTestParser_testBug49297MultiplePageEncoding4 {
	public static void main(String[] args) {
		try {
			new TestParser().testBug49297MultiplePageEncoding4();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}