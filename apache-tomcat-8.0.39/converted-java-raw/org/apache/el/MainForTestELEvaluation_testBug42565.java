package org.apache.el;

import org.apache.el.TestELEvaluation;

public class MainForTestELEvaluation_testBug42565 {
	public static void main(String[] args) {
		try {
			new TestELEvaluation().testBug42565();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}