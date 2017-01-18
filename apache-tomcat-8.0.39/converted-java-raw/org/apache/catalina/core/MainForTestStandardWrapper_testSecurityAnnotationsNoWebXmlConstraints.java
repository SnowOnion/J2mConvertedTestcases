package org.apache.catalina.core;

import org.apache.catalina.core.TestStandardWrapper;

public class MainForTestStandardWrapper_testSecurityAnnotationsNoWebXmlConstraints {
	public static void main(String[] args) {
		try {
			new TestStandardWrapper().testSecurityAnnotationsNoWebXmlConstraints();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}