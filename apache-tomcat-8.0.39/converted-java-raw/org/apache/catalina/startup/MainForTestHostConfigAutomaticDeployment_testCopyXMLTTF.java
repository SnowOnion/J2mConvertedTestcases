package org.apache.catalina.startup;

import org.apache.catalina.startup.TestHostConfigAutomaticDeployment;

public class MainForTestHostConfigAutomaticDeployment_testCopyXMLTTF {
	public static void main(String[] args) {
		try {
			new TestHostConfigAutomaticDeployment().testCopyXMLTTF();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}