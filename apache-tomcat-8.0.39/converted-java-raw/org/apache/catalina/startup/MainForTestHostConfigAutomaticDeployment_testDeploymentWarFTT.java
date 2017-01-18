package org.apache.catalina.startup;

import org.apache.catalina.startup.TestHostConfigAutomaticDeployment;

public class MainForTestHostConfigAutomaticDeployment_testDeploymentWarFTT {
	public static void main(String[] args) {
		try {
			new TestHostConfigAutomaticDeployment().testDeploymentWarFTT();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}