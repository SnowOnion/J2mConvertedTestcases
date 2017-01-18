package org.apache.tomcat.util.descriptor.web;

import org.apache.tomcat.util.descriptor.web.TestWebXml;

public class MainForTestWebXml_testLifecycleMethodsWebFragments {
	public static void main(String[] args) {
		try {
			new TestWebXml().testLifecycleMethodsWebFragments();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}