package org.apache.catalina.startup;

import org.apache.catalina.startup.TestHostConfigAutomaticDeployment;

public class MainForTestHostConfigAutomaticDeployment_testDeploymentDirFTF {
	public static void main(String[] args) {
		try {
			new TestHostConfigAutomaticDeployment().testDeploymentDirFTF();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}