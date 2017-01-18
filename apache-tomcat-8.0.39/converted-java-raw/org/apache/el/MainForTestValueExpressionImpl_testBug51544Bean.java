package org.apache.el;

import org.apache.el.TestValueExpressionImpl;

public class MainForTestValueExpressionImpl_testBug51544Bean {
	public static void main(String[] args) {
		try {
			new TestValueExpressionImpl().testBug51544Bean();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}