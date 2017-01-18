package org.apache.catalina.startup;

import org.apache.catalina.startup.TestHostConfigAutomaticDeployment;

public class MainForTestHostConfigAutomaticDeployment_testModifyWarDirUpdateDir {
	public static void main(String[] args) {
		try {
			new TestHostConfigAutomaticDeployment().testModifyWarDirUpdateDir();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}