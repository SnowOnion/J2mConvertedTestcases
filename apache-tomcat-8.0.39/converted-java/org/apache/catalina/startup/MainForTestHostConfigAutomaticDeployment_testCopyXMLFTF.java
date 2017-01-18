package org.apache.catalina.startup;

import org.apache.catalina.startup.TestHostConfigAutomaticDeployment;

public class MainForTestHostConfigAutomaticDeployment_testCopyXMLFTF {
	public static void main(String[] args) {
		try {
			new TestHostConfigAutomaticDeployment().testCopyXMLFTF();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}