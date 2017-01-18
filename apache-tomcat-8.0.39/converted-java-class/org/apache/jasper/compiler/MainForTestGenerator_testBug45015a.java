package org.apache.jasper.compiler;

import org.apache.jasper.compiler.TestGenerator;

public class MainForTestGenerator_testBug45015a {
	public static void main(String[] args) {
		try {
			new TestGenerator().testBug45015a();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}