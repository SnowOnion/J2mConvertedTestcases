package org.apache.catalina.startup;

import org.apache.catalina.startup.TestHostConfigAutomaticDeployment;

public class MainForTestHostConfigAutomaticDeployment_testAdditionDirAddXml {
	public static void main(String[] args) {
		try {
			new TestHostConfigAutomaticDeployment().testAdditionDirAddXml();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}