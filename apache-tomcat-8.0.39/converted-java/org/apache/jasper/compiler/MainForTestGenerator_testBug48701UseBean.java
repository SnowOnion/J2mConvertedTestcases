package org.apache.jasper.compiler;

import org.apache.jasper.compiler.TestGenerator;

public class MainForTestGenerator_testBug48701UseBean {
	public static void main(String[] args) {
		try {
			new TestGenerator().testBug48701UseBean();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}