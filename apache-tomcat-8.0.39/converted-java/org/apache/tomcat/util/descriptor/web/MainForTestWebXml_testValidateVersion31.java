package org.apache.tomcat.util.descriptor.web;

import org.apache.tomcat.util.descriptor.web.TestWebXml;

public class MainForTestWebXml_testValidateVersion31 {
	public static void main(String[] args) {
		try {
			new TestWebXml().testValidateVersion31();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}