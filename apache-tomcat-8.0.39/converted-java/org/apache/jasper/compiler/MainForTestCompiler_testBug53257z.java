package org.apache.jasper.compiler;

import org.apache.jasper.compiler.TestCompiler;

public class MainForTestCompiler_testBug53257z {
	public static void main(String[] args) {
		try {
			new TestCompiler().testBug53257z();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}