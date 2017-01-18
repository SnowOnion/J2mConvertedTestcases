package org.apache.tomcat.util.descriptor.web;

import org.apache.tomcat.util.descriptor.web.TestServletDef;

public class MainForTestServletDef_testSetServletName {
	public static void main(String[] args) {
		try {
			new TestServletDef().testSetServletName();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}