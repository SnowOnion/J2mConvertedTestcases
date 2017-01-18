package org.apache.el;

import org.apache.el.TestELEvaluation;

public class MainForTestELEvaluation_testBug49081b {
	public static void main(String[] args) {
		try {
			new TestELEvaluation().testBug49081b();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}