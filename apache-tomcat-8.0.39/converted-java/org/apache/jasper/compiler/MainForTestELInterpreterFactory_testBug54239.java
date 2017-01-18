package org.apache.jasper.compiler;

import org.apache.jasper.compiler.TestELInterpreterFactory;

public class MainForTestELInterpreterFactory_testBug54239 {
	public static void main(String[] args) {
		try {
			new TestELInterpreterFactory().testBug54239();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}