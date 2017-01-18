package org.apache.tomcat.util.descriptor.web;

import org.apache.tomcat.util.descriptor.web.TestWebXml;

public class MainForTestWebXml_testBug54387b {
	public static void main(String[] args) {
		try {
			new TestWebXml().testBug54387b();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}