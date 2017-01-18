package org.apache.catalina.startup;

import org.apache.catalina.startup.TestHostConfigAutomaticDeployment;

public class MainForTestHostConfigAutomaticDeployment_testDeleteWarDirRemoveDir {
	public static void main(String[] args) {
		try {
			new TestHostConfigAutomaticDeployment().testDeleteWarDirRemoveDir();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}