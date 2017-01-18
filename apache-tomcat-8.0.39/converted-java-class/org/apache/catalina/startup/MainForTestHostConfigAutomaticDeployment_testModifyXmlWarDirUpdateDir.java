package org.apache.catalina.startup;

import org.apache.catalina.startup.TestHostConfigAutomaticDeployment;

public class MainForTestHostConfigAutomaticDeployment_testModifyXmlWarDirUpdateDir {
	public static void main(String[] args) {
		try {
			new TestHostConfigAutomaticDeployment().testModifyXmlWarDirUpdateDir();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}