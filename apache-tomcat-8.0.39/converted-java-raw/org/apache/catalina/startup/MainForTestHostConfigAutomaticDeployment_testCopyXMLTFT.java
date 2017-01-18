package org.apache.catalina.startup;

import org.apache.catalina.startup.TestHostConfigAutomaticDeployment;

public class MainForTestHostConfigAutomaticDeployment_testCopyXMLTFT {
	public static void main(String[] args) {
		try {
			new TestHostConfigAutomaticDeployment().testCopyXMLTFT();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}