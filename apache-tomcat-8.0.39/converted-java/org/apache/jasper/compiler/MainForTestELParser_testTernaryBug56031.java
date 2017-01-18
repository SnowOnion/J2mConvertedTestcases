package org.apache.jasper.compiler;

import org.apache.jasper.compiler.TestELParser;

public class MainForTestELParser_testTernaryBug56031 {
	public static void main(String[] args) {
		try {
			new TestELParser().testTernaryBug56031();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}