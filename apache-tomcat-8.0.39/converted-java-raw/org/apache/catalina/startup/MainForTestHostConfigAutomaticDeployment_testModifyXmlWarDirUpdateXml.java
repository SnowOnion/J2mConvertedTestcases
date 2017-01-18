package org.apache.catalina.startup;

import org.apache.catalina.startup.TestHostConfigAutomaticDeployment;

public class MainForTestHostConfigAutomaticDeployment_testModifyXmlWarDirUpdateXml {
	public static void main(String[] args) {
		try {
			new TestHostConfigAutomaticDeployment().testModifyXmlWarDirUpdateXml();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}