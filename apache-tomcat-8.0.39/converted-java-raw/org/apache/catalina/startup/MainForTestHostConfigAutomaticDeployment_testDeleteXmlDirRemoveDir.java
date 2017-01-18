package org.apache.catalina.startup;

import org.apache.catalina.startup.TestHostConfigAutomaticDeployment;

public class MainForTestHostConfigAutomaticDeployment_testDeleteXmlDirRemoveDir {
	public static void main(String[] args) {
		try {
			new TestHostConfigAutomaticDeployment().testDeleteXmlDirRemoveDir();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}