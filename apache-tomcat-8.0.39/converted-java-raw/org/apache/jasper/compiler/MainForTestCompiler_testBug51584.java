package org.apache.jasper.compiler;

import org.apache.jasper.compiler.TestCompiler;

public class MainForTestCompiler_testBug51584 {
	public static void main(String[] args) {
		try {
			new TestCompiler().testBug51584();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}