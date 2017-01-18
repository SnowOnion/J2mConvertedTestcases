package org.apache.tomcat.util.descriptor.web;

import org.apache.tomcat.util.descriptor.web.TestWebXml;

public class MainForTestWebXml_testParseVersion30 {
	public static void main(String[] args) {
		try {
			new TestWebXml().testParseVersion30();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}