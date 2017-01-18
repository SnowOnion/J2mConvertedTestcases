package org.apache.jasper.compiler;

import org.apache.jasper.compiler.TestCompiler;

public class MainForTestCompiler_testBug55262 {
	public static void main(String[] args) {
		try {
			new TestCompiler().testBug55262();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}