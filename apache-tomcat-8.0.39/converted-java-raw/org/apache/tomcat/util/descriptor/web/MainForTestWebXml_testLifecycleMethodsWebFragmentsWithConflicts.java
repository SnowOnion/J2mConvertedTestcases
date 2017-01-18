package org.apache.tomcat.util.descriptor.web;

import org.apache.tomcat.util.descriptor.web.TestWebXml;

public class MainForTestWebXml_testLifecycleMethodsWebFragmentsWithConflicts {
	public static void main(String[] args) {
		try {
			new TestWebXml().testLifecycleMethodsWebFragmentsWithConflicts();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}