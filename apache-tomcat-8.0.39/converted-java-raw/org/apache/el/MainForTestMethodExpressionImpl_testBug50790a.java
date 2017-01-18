package org.apache.el;

import org.apache.el.TestMethodExpressionImpl;

public class MainForTestMethodExpressionImpl_testBug50790a {
	public static void main(String[] args) {
		try {
			new TestMethodExpressionImpl().testBug50790a();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}