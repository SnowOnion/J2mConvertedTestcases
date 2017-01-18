package org.apache.catalina.startup;

import org.apache.catalina.startup.TestHostConfigAutomaticDeployment;

public class MainForTestHostConfigAutomaticDeployment_testDeploymentWarFTF {
	public static void main(String[] args) {
		try {
			new TestHostConfigAutomaticDeployment().testDeploymentWarFTF();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}