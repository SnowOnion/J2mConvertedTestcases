package org.apache.el;

import org.apache.el.TestMethodExpressionImpl;

public class MainForTestMethodExpressionImpl_testBug56797b {
	public static void main(String[] args) {
		try {
			new TestMethodExpressionImpl().testBug56797b();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}