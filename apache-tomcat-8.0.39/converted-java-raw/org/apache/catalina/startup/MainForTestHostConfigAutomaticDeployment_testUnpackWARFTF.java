package org.apache.catalina.startup;

import org.apache.catalina.startup.TestHostConfigAutomaticDeployment;

public class MainForTestHostConfigAutomaticDeployment_testUnpackWARFTF {
	public static void main(String[] args) {
		try {
			new TestHostConfigAutomaticDeployment().testUnpackWARFTF();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}