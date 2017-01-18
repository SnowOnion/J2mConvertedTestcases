package org.apache.catalina.startup;

import org.apache.catalina.startup.TestHostConfigAutomaticDeployment;

public class MainForTestHostConfigAutomaticDeployment_testDeleteDirRemoveDir {
	public static void main(String[] args) {
		try {
			new TestHostConfigAutomaticDeployment().testDeleteDirRemoveDir();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}