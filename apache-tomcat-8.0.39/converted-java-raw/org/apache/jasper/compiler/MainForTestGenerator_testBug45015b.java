package org.apache.jasper.compiler;

import org.apache.jasper.compiler.TestGenerator;

public class MainForTestGenerator_testBug45015b {
	public static void main(String[] args) {
		try {
			new TestGenerator().testBug45015b();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}