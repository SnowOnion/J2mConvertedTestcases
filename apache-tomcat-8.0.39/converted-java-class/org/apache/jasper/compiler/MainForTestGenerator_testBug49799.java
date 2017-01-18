package org.apache.jasper.compiler;

import org.apache.jasper.compiler.TestGenerator;

public class MainForTestGenerator_testBug49799 {
	public static void main(String[] args) {
		try {
			new TestGenerator().testBug49799();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}