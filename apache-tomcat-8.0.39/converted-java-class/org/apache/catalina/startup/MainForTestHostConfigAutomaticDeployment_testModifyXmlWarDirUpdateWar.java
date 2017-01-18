package org.apache.catalina.startup;

import org.apache.catalina.startup.TestHostConfigAutomaticDeployment;

public class MainForTestHostConfigAutomaticDeployment_testModifyXmlWarDirUpdateWar {
	public static void main(String[] args) {
		try {
			new TestHostConfigAutomaticDeployment().testModifyXmlWarDirUpdateWar();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}