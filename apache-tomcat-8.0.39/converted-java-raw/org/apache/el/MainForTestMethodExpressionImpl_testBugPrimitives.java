package org.apache.el;

import org.apache.el.TestMethodExpressionImpl;

public class MainForTestMethodExpressionImpl_testBugPrimitives {
	public static void main(String[] args) {
		try {
			new TestMethodExpressionImpl().testBugPrimitives();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}