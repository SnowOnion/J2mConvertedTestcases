package org.apache.el;

import org.apache.el.TestValueExpressionImpl;

public class MainForTestValueExpressionImpl_testBug49345 {
	public static void main(String[] args) {
		try {
			new TestValueExpressionImpl().testBug49345();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}