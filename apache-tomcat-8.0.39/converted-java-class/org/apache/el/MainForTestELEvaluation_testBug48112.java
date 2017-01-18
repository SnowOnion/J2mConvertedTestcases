package org.apache.el;

import org.apache.el.TestELEvaluation;

public class MainForTestELEvaluation_testBug48112 {
	public static void main(String[] args) {
		try {
			new TestELEvaluation().testBug48112();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}