package org.apache.tomcat.util.descriptor.web;

import org.apache.tomcat.util.descriptor.web.TestWebXml;

public class MainForTestWebXml_testValidateVersion25 {
	public static void main(String[] args) {
		try {
			new TestWebXml().testValidateVersion25();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}