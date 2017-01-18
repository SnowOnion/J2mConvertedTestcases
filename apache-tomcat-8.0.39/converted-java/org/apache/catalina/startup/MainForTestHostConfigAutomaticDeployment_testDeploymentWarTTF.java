package org.apache.catalina.startup;

import org.apache.catalina.startup.TestHostConfigAutomaticDeployment;

public class MainForTestHostConfigAutomaticDeployment_testDeploymentWarTTF {
	public static void main(String[] args) {
		try {
			new TestHostConfigAutomaticDeployment().testDeploymentWarTTF();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}