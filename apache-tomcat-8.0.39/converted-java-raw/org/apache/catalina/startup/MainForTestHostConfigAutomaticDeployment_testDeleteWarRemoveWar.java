package org.apache.catalina.startup;

import org.apache.catalina.startup.TestHostConfigAutomaticDeployment;

public class MainForTestHostConfigAutomaticDeployment_testDeleteWarRemoveWar {
	public static void main(String[] args) {
		try {
			new TestHostConfigAutomaticDeployment().testDeleteWarRemoveWar();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}