package org.apache.catalina.startup;

import org.apache.catalina.startup.TestTomcat;

public class MainForTestTomcat_testBug51526 {
	public static void main(String[] args) {
		try {
			new TestTomcat().testBug51526();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}