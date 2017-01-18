package org.apache.el;

import org.apache.el.TestMethodExpressionImpl;

public class MainForTestMethodExpressionImpl_testBug49655 {
	public static void main(String[] args) {
		try {
			new TestMethodExpressionImpl().testBug49655();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}