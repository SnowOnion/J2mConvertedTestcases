package org.apache.catalina.startup;

import org.apache.catalina.startup.TestHostConfigAutomaticDeployment;

public class MainForTestHostConfigAutomaticDeployment_testAdditionXmlWarAddDir {
	public static void main(String[] args) {
		try {
			new TestHostConfigAutomaticDeployment().testAdditionXmlWarAddDir();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}