package org.apache.jasper.compiler;

import org.apache.jasper.compiler.TestCompiler;

public class MainForTestCompiler_testBug49726a {
	public static void main(String[] args) {
		try {
			new TestCompiler().testBug49726a();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}