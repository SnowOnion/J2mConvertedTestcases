package org.apache.catalina.startup;

import org.apache.catalina.startup.TestHostConfigAutomaticDeployment;

public class MainForTestHostConfigAutomaticDeployment_testDeploymentDirFTT {
	public static void main(String[] args) {
		try {
			new TestHostConfigAutomaticDeployment().testDeploymentDirFTT();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}