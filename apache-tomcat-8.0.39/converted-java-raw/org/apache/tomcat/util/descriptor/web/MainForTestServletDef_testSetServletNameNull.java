package org.apache.tomcat.util.descriptor.web;

import org.apache.tomcat.util.descriptor.web.TestServletDef;

public class MainForTestServletDef_testSetServletNameNull {
	public static void main(String[] args) {
		try {
			new TestServletDef().testSetServletNameNull();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}