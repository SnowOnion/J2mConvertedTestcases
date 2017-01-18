package org.apache.catalina.startup;

import org.apache.catalina.startup.TestHostConfigAutomaticDeployment;

public class MainForTestHostConfigAutomaticDeployment_testModifyWarUpdateWar {
	public static void main(String[] args) {
		try {
			new TestHostConfigAutomaticDeployment().testModifyWarUpdateWar();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}