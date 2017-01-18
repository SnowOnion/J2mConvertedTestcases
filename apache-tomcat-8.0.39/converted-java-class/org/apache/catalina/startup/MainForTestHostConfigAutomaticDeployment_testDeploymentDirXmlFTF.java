package org.apache.catalina.startup;

import org.apache.catalina.startup.TestHostConfigAutomaticDeployment;

public class MainForTestHostConfigAutomaticDeployment_testDeploymentDirXmlFTF {
	public static void main(String[] args) {
		try {
			new TestHostConfigAutomaticDeployment().testDeploymentDirXmlFTF();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}