package org.apache.el;

import org.apache.el.TestMethodExpressionImpl;

public class MainForTestMethodExpressionImpl_testBug53792d {
	public static void main(String[] args) {
		try {
			new TestMethodExpressionImpl().testBug53792d();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}