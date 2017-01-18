package org.apache.catalina.startup;

import org.apache.catalina.startup.TestHostConfigAutomaticDeployment;

public class MainForTestHostConfigAutomaticDeployment_testDeleteXmlWarDirRemoveWarCopyXml {
	public static void main(String[] args) {
		try {
			new TestHostConfigAutomaticDeployment().testDeleteXmlWarDirRemoveWarCopyXml();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}