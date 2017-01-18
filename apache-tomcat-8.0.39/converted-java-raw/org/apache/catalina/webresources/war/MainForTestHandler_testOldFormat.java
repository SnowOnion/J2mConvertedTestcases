package org.apache.catalina.webresources.war;

import org.apache.catalina.webresources.war.TestHandler;

public class MainForTestHandler_testOldFormat {
	public static void main(String[] args) {
		try {
			new TestHandler().testOldFormat();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}