package org.apache.catalina.startup;

import org.apache.catalina.startup.TestHostConfigAutomaticDeployment;

public class MainForTestHostConfigAutomaticDeployment_testAdditionWarDirAddXml {
	public static void main(String[] args) {
		try {
			new TestHostConfigAutomaticDeployment().testAdditionWarDirAddXml();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}