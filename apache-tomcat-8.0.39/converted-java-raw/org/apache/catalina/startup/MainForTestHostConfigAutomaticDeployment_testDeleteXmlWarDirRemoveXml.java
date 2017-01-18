package org.apache.catalina.startup;

import org.apache.catalina.startup.TestHostConfigAutomaticDeployment;

public class MainForTestHostConfigAutomaticDeployment_testDeleteXmlWarDirRemoveXml {
	public static void main(String[] args) {
		try {
			new TestHostConfigAutomaticDeployment().testDeleteXmlWarDirRemoveXml();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}