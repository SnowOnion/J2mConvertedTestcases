package org.apache.el;

import org.apache.el.TestMethodExpressionImpl;

public class MainForTestMethodExpressionImpl_testBug57855e {
	public static void main(String[] args) {
		try {
			new TestMethodExpressionImpl().testBug57855e();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}