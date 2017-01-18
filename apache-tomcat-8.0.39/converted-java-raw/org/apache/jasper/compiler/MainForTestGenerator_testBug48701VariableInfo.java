package org.apache.jasper.compiler;

import org.apache.jasper.compiler.TestGenerator;

public class MainForTestGenerator_testBug48701VariableInfo {
	public static void main(String[] args) {
		try {
			new TestGenerator().testBug48701VariableInfo();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}