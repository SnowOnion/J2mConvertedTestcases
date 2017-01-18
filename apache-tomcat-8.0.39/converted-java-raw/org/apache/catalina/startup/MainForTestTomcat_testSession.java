package org.apache.catalina.startup;

import org.apache.catalina.startup.TestTomcat;

public class MainForTestTomcat_testSession {
	public static void main(String[] args) {
		try {
			new TestTomcat().testSession();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}