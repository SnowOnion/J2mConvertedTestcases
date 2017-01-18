package org.apache.catalina.startup;

import org.apache.catalina.startup.TestHostConfigAutomaticDeployment;

public class MainForTestHostConfigAutomaticDeployment_testModifyXmlExtdirUpdateXml {
	public static void main(String[] args) {
		try {
			new TestHostConfigAutomaticDeployment().testModifyXmlExtdirUpdateXml();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}