package org.apache.tomcat.util.descriptor.web;

import org.apache.tomcat.util.descriptor.web.TestJspConfigDescriptorImpl;

public class MainForTestJspConfigDescriptorImpl_testPropertyGroupsAreIsolate {
	public static void main(String[] args) {
		try {
			new TestJspConfigDescriptorImpl().testPropertyGroupsAreIsolate();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}