package org.apache.jasper.compiler;

import org.apache.jasper.compiler.TestGenerator;

public class MainForTestGenerator_testBug48701TagVariableInfoNameGiven {
	public static void main(String[] args) {
		try {
			new TestGenerator().testBug48701TagVariableInfoNameGiven();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}