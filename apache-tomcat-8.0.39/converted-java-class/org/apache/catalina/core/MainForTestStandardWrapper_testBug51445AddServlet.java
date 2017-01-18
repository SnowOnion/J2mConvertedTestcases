package org.apache.catalina.core;

import org.apache.catalina.core.TestStandardWrapper;

public class MainForTestStandardWrapper_testBug51445AddServlet {
	public static void main(String[] args) {
		try {
			new TestStandardWrapper().testBug51445AddServlet();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}