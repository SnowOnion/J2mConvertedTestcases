package org.apache.catalina.startup;

import org.apache.catalina.startup.TestHostConfigAutomaticDeployment;

public class MainForTestHostConfigAutomaticDeployment_testUnpackWARFFT {
	public static void main(String[] args) {
		try {
			new TestHostConfigAutomaticDeployment().testUnpackWARFFT();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}