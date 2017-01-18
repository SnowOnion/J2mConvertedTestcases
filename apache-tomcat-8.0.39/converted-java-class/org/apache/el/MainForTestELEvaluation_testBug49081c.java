package org.apache.el;

import org.apache.el.TestELEvaluation;

public class MainForTestELEvaluation_testBug49081c {
	public static void main(String[] args) {
		try {
			new TestELEvaluation().testBug49081c();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}