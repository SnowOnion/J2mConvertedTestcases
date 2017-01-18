package org.apache.catalina.startup;

import org.apache.catalina.startup.TestHostConfigAutomaticDeployment;

public class MainForTestHostConfigAutomaticDeployment_testDeleteXmlWarDirRemoveWar {
	public static void main(String[] args) {
		try {
			new TestHostConfigAutomaticDeployment().testDeleteXmlWarDirRemoveWar();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}