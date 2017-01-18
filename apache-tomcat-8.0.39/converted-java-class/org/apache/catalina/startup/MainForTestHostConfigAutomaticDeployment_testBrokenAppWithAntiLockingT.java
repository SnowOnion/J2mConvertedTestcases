package org.apache.catalina.startup;

import org.apache.catalina.startup.TestHostConfigAutomaticDeployment;

public class MainForTestHostConfigAutomaticDeployment_testBrokenAppWithAntiLockingT {
	public static void main(String[] args) {
		try {
			new TestHostConfigAutomaticDeployment().testBrokenAppWithAntiLockingT();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}