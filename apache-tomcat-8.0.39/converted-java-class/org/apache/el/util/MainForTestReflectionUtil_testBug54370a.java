package org.apache.el.util;

import org.apache.el.util.TestReflectionUtil;

public class MainForTestReflectionUtil_testBug54370a {
	public static void main(String[] args) {
		try {
			new TestReflectionUtil().testBug54370a();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}