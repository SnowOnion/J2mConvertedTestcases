package org.apache.el;

import org.apache.el.TestMethodExpressionImpl;

public class MainForTestMethodExpressionImpl_testBug57855b {
	public static void main(String[] args) {
		try {
			new TestMethodExpressionImpl().testBug57855b();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}