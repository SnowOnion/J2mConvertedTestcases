package org.apache.catalina.startup;

import org.apache.catalina.startup.TestHostConfigAutomaticDeployment;

public class MainForTestHostConfigAutomaticDeployment_testCopyXMLTFF {
	public static void main(String[] args) {
		try {
			new TestHostConfigAutomaticDeployment().testCopyXMLTFF();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}