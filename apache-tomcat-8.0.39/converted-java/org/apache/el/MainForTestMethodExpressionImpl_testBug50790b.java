package org.apache.el;

import org.apache.el.TestMethodExpressionImpl;

public class MainForTestMethodExpressionImpl_testBug50790b {
	public static void main(String[] args) {
		try {
			new TestMethodExpressionImpl().testBug50790b();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}