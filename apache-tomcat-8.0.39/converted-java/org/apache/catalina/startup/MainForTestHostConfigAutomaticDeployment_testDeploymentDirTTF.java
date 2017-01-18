package org.apache.catalina.startup;

import org.apache.catalina.startup.TestHostConfigAutomaticDeployment;

public class MainForTestHostConfigAutomaticDeployment_testDeploymentDirTTF {
	public static void main(String[] args) {
		try {
			new TestHostConfigAutomaticDeployment().testDeploymentDirTTF();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}