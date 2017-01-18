package org.apache.el;

import org.apache.el.TestELEvaluation;

public class MainForTestELEvaluation_testBug44994 {
	public static void main(String[] args) {
		try {
			new TestELEvaluation().testBug44994();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}