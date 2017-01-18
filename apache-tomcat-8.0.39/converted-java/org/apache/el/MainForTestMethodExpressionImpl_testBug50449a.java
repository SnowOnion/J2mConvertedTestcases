package org.apache.el;

import org.apache.el.TestMethodExpressionImpl;

public class MainForTestMethodExpressionImpl_testBug50449a {
	public static void main(String[] args) {
		try {
			new TestMethodExpressionImpl().testBug50449a();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}