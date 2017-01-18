package org.apache.catalina.session;

import org.apache.catalina.session.TestPersistentManagerIntegration;

public class MainForTestPersistentManagerIntegration_testCreateSessionAndPassivate {
	public static void main(String[] args) {
		try {
			new TestPersistentManagerIntegration().testCreateSessionAndPassivate();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}