package org.apache.el;

import org.apache.el.TestValueExpressionImpl;

public class MainForTestValueExpressionImpl_testBug51544Direct {
	public static void main(String[] args) {
		try {
			new TestValueExpressionImpl().testBug51544Direct();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}