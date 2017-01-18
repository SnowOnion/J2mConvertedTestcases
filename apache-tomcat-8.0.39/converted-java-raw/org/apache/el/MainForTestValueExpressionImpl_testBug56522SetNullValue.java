package org.apache.el;

import org.apache.el.TestValueExpressionImpl;

public class MainForTestValueExpressionImpl_testBug56522SetNullValue {
	public static void main(String[] args) {
		try {
			new TestValueExpressionImpl().testBug56522SetNullValue();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}