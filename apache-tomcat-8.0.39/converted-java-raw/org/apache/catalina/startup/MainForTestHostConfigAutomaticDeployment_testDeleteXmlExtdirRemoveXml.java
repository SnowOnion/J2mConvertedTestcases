package org.apache.catalina.startup;

import org.apache.catalina.startup.TestHostConfigAutomaticDeployment;

public class MainForTestHostConfigAutomaticDeployment_testDeleteXmlExtdirRemoveXml {
	public static void main(String[] args) {
		try {
			new TestHostConfigAutomaticDeployment().testDeleteXmlExtdirRemoveXml();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}