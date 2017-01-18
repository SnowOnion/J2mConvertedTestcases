package org.apache.catalina.startup;

import org.apache.catalina.startup.TestTomcat;

public class MainForTestTomcat_testBug53301 {
	public static void main(String[] args) {
		try {
			new TestTomcat().testBug53301();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}