package org.apache.el.lang;

import org.apache.el.lang.TestELArithmetic;

public class MainForTestELArithmetic_testBug47371bigDecimal {
	public static void main(String[] args) {
		try {
			new TestELArithmetic().testBug47371bigDecimal();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}