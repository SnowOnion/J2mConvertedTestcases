package org.apache.el;

import org.apache.el.TestValueExpressionImpl;

public class MainForTestValueExpressionImpl_testBug51177ObjectMap {
	public static void main(String[] args) {
		try {
			new TestValueExpressionImpl().testBug51177ObjectMap();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}