package org.apache.el.util;

import org.apache.el.util.TestReflectionUtil;

public class MainForTestReflectionUtil_testBug54370b {
	public static void main(String[] args) {
		try {
			new TestReflectionUtil().testBug54370b();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}