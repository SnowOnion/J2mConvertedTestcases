package org.apache.catalina.webresources.war;

import org.apache.catalina.webresources.war.TestHandlerIntegration;

public class MainForTestHandlerIntegration_testToURI {
	public static void main(String[] args) {
		try {
			new TestHandlerIntegration().testToURI();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}