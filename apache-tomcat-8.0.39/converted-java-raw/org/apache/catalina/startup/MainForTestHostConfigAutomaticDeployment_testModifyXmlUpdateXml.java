package org.apache.catalina.startup;

import org.apache.catalina.startup.TestHostConfigAutomaticDeployment;

public class MainForTestHostConfigAutomaticDeployment_testModifyXmlUpdateXml {
	public static void main(String[] args) {
		try {
			new TestHostConfigAutomaticDeployment().testModifyXmlUpdateXml();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}