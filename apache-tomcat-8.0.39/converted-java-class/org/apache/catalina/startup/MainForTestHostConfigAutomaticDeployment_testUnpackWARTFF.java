package org.apache.catalina.startup;

import org.apache.catalina.startup.TestHostConfigAutomaticDeployment;

public class MainForTestHostConfigAutomaticDeployment_testUnpackWARTFF {
	public static void main(String[] args) {
		try {
			new TestHostConfigAutomaticDeployment().testUnpackWARTFF();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}