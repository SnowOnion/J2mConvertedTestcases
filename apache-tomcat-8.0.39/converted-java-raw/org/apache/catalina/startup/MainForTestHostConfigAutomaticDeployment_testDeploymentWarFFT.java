package org.apache.catalina.startup;

import org.apache.catalina.startup.TestHostConfigAutomaticDeployment;

public class MainForTestHostConfigAutomaticDeployment_testDeploymentWarFFT {
	public static void main(String[] args) {
		try {
			new TestHostConfigAutomaticDeployment().testDeploymentWarFFT();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}