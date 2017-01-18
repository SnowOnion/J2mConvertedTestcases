package org.apache.catalina.startup;

import org.apache.catalina.startup.TestTomcat;

public class MainForTestTomcat_testBug50826 {
	public static void main(String[] args) {
		try {
			new TestTomcat().testBug50826();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}