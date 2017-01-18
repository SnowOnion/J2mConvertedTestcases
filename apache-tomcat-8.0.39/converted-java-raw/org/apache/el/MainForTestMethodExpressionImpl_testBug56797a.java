package org.apache.el;

import org.apache.el.TestMethodExpressionImpl;

public class MainForTestMethodExpressionImpl_testBug56797a {
	public static void main(String[] args) {
		try {
			new TestMethodExpressionImpl().testBug56797a();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}