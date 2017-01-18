package org.apache.jasper.compiler;

import org.apache.jasper.compiler.TestGenerator;

public class MainForTestGenerator_testBug56581 {
	public static void main(String[] args) {
		try {
			new TestGenerator().testBug56581();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}