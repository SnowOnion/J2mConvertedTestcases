package org.apache.catalina.startup;

import org.apache.catalina.startup.TestHostConfigAutomaticDeployment;

public class MainForTestHostConfigAutomaticDeployment_testAdditionDirAddWar {
	public static void main(String[] args) {
		try {
			new TestHostConfigAutomaticDeployment().testAdditionDirAddWar();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}