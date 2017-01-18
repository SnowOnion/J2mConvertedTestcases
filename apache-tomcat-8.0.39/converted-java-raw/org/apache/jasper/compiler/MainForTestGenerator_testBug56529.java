package org.apache.jasper.compiler;

import org.apache.jasper.compiler.TestGenerator;

public class MainForTestGenerator_testBug56529 {
	public static void main(String[] args) {
		try {
			new TestGenerator().testBug56529();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}