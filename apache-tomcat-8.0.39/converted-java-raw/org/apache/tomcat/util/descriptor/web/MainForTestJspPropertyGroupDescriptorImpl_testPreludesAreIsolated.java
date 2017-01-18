package org.apache.tomcat.util.descriptor.web;

import org.apache.tomcat.util.descriptor.web.TestJspPropertyGroupDescriptorImpl;

public class MainForTestJspPropertyGroupDescriptorImpl_testPreludesAreIsolated {
	public static void main(String[] args) {
		try {
			new TestJspPropertyGroupDescriptorImpl().testPreludesAreIsolated();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}