package org.apache.el;

import org.apache.el.TestMethodExpressionImpl;

public class MainForTestMethodExpressionImpl_testBug57855d {
	public static void main(String[] args) {
		try {
			new TestMethodExpressionImpl().testBug57855d();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}