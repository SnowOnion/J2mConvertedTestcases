package org.apache.catalina.startup;

import org.apache.catalina.startup.TestHostConfigAutomaticDeployment;

public class MainForTestHostConfigAutomaticDeployment_testModifyWarDirUpdateWar {
	public static void main(String[] args) {
		try {
			new TestHostConfigAutomaticDeployment().testModifyWarDirUpdateWar();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}