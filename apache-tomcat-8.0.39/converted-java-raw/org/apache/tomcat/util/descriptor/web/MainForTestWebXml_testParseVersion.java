package org.apache.tomcat.util.descriptor.web;

import org.apache.tomcat.util.descriptor.web.TestWebXml;

public class MainForTestWebXml_testParseVersion {
	public static void main(String[] args) {
		try {
			new TestWebXml().testParseVersion();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}