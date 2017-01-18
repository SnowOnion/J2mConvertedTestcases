package org.apache.catalina.startup;

import org.apache.catalina.startup.TestHostConfigAutomaticDeployment;

public class MainForTestHostConfigAutomaticDeployment_testDeploymentDirFFT {
	public static void main(String[] args) {
		try {
			new TestHostConfigAutomaticDeployment().testDeploymentDirFFT();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}