package org.apache.el;

import org.apache.el.TestMethodExpressionImpl;

public class MainForTestMethodExpressionImpl_testBug52970 {
	public static void main(String[] args) {
		try {
			new TestMethodExpressionImpl().testBug52970();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}