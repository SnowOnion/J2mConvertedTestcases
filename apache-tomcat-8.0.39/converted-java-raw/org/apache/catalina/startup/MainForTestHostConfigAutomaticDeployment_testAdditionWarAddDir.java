package org.apache.catalina.startup;

import org.apache.catalina.startup.TestHostConfigAutomaticDeployment;

public class MainForTestHostConfigAutomaticDeployment_testAdditionWarAddDir {
	public static void main(String[] args) {
		try {
			new TestHostConfigAutomaticDeployment().testAdditionWarAddDir();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}