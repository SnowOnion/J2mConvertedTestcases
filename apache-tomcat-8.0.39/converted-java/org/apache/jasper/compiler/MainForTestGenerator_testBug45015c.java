package org.apache.jasper.compiler;

import org.apache.jasper.compiler.TestGenerator;

public class MainForTestGenerator_testBug45015c {
	public static void main(String[] args) {
		try {
			new TestGenerator().testBug45015c();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}