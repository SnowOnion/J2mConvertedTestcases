package org.apache.catalina.startup;

import org.apache.catalina.startup.TestHostConfigAutomaticDeployment;

public class MainForTestHostConfigAutomaticDeployment_testCopyXMLFTT {
	public static void main(String[] args) {
		try {
			new TestHostConfigAutomaticDeployment().testCopyXMLFTT();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}