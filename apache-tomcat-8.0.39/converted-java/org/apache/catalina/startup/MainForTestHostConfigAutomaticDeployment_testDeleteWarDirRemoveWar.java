package org.apache.catalina.startup;

import org.apache.catalina.startup.TestHostConfigAutomaticDeployment;

public class MainForTestHostConfigAutomaticDeployment_testDeleteWarDirRemoveWar {
	public static void main(String[] args) {
		try {
			new TestHostConfigAutomaticDeployment().testDeleteWarDirRemoveWar();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}