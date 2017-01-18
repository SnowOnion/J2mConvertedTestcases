package org.apache.tomcat.util.descriptor.web;

import org.apache.tomcat.util.descriptor.web.TestWebXml;

public class MainForTestWebXml_testLifecycleMethodsWebXml {
	public static void main(String[] args) {
		try {
			new TestWebXml().testLifecycleMethodsWebXml();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}