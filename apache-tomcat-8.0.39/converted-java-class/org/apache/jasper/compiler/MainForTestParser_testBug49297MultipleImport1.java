package org.apache.jasper.compiler;

import org.apache.jasper.compiler.TestParser;

public class MainForTestParser_testBug49297MultipleImport1 {
	public static void main(String[] args) {
		try {
			new TestParser().testBug49297MultipleImport1();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}