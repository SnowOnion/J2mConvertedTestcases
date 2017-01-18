package org.apache.el;

import org.apache.el.TestELEvaluation;

public class MainForTestELEvaluation_testBug49081a {
	public static void main(String[] args) {
		try {
			new TestELEvaluation().testBug49081a();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}