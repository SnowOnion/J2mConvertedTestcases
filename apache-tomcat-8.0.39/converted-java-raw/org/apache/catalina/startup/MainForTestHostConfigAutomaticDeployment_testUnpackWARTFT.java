package org.apache.catalina.startup;

import org.apache.catalina.startup.TestHostConfigAutomaticDeployment;

public class MainForTestHostConfigAutomaticDeployment_testUnpackWARTFT {
	public static void main(String[] args) {
		try {
			new TestHostConfigAutomaticDeployment().testUnpackWARTFT();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}