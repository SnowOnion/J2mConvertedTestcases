package org.apache.catalina.startup;

import org.apache.catalina.startup.TestHostConfigAutomaticDeployment;

public class MainForTestHostConfigAutomaticDeployment_testUnpackWARTTF {
	public static void main(String[] args) {
		try {
			new TestHostConfigAutomaticDeployment().testUnpackWARTTF();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}