package org.apache.el;

import org.apache.el.TestMethodExpressionImpl;

public class MainForTestMethodExpressionImpl_testBug52445a {
	public static void main(String[] args) {
		try {
			new TestMethodExpressionImpl().testBug52445a();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}