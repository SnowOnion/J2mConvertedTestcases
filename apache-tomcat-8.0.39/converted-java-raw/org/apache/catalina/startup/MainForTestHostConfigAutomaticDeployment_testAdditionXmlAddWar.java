package org.apache.catalina.startup;

import org.apache.catalina.startup.TestHostConfigAutomaticDeployment;

public class MainForTestHostConfigAutomaticDeployment_testAdditionXmlAddWar {
	public static void main(String[] args) {
		try {
			new TestHostConfigAutomaticDeployment().testAdditionXmlAddWar();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}