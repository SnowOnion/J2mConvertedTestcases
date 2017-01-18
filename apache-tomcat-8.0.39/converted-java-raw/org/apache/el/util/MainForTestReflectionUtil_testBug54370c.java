package org.apache.el.util;

import org.apache.el.util.TestReflectionUtil;

public class MainForTestReflectionUtil_testBug54370c {
	public static void main(String[] args) {
		try {
			new TestReflectionUtil().testBug54370c();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}