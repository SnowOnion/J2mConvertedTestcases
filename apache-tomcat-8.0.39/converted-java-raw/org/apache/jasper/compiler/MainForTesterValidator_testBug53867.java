package org.apache.jasper.compiler;

import org.apache.jasper.compiler.TesterValidator;

public class MainForTesterValidator_testBug53867 {
	public static void main(String[] args) {
		try {
			new TesterValidator().testBug53867();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}