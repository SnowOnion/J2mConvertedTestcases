package org.apache.catalina.startup;

import org.apache.catalina.startup.TestHostConfigAutomaticDeployment;

public class MainForTestHostConfigAutomaticDeployment_testBrokenAppWithAntiLockingF {
	public static void main(String[] args) {
		try {
			new TestHostConfigAutomaticDeployment().testBrokenAppWithAntiLockingF();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}