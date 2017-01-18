package org.apache.catalina.core;

import org.apache.catalina.core.TestStandardWrapper;

public class MainForTestStandardWrapper_testBug51445AddChild {
	public static void main(String[] args) {
		try {
			new TestStandardWrapper().testBug51445AddChild();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}