package org.apache.el;

import org.apache.el.TestMethodExpressionImpl;

public class MainForTestMethodExpressionImpl_testBug57855a {
	public static void main(String[] args) {
		try {
			new TestMethodExpressionImpl().testBug57855a();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}