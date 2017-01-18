package org.apache.catalina.startup;

import org.apache.catalina.startup.TestHostConfigAutomaticDeployment;

public class MainForTestHostConfigAutomaticDeployment_testModifyXmlWarUpdateXml {
	public static void main(String[] args) {
		try {
			new TestHostConfigAutomaticDeployment().testModifyXmlWarUpdateXml();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}