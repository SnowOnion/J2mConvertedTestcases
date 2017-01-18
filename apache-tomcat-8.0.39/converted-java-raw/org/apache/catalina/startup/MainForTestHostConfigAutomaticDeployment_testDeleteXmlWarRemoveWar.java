package org.apache.catalina.startup;

import org.apache.catalina.startup.TestHostConfigAutomaticDeployment;

public class MainForTestHostConfigAutomaticDeployment_testDeleteXmlWarRemoveWar {
	public static void main(String[] args) {
		try {
			new TestHostConfigAutomaticDeployment().testDeleteXmlWarRemoveWar();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}