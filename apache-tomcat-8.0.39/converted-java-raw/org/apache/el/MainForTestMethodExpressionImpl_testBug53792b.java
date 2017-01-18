package org.apache.el;

import org.apache.el.TestMethodExpressionImpl;

public class MainForTestMethodExpressionImpl_testBug53792b {
	public static void main(String[] args) {
		try {
			new TestMethodExpressionImpl().testBug53792b();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}