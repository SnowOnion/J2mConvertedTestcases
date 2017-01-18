package org.apache.el;

import org.apache.el.TestValueExpressionImpl;

public class MainForTestValueExpressionImpl_testBug50105 {
	public static void main(String[] args) {
		try {
			new TestValueExpressionImpl().testBug50105();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}