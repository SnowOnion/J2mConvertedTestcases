package org.apache.catalina.startup;

import org.apache.catalina.startup.TestHostConfigAutomaticDeployment;

public class MainForTestHostConfigAutomaticDeployment_testModifyXmlDirUpdateXml {
	public static void main(String[] args) {
		try {
			new TestHostConfigAutomaticDeployment().testModifyXmlDirUpdateXml();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}