package org.apache.tomcat.util.descriptor.web;

import org.apache.tomcat.util.descriptor.web.TestServletDef;

public class MainForTestServletDef_testSetServletNameEmptyString {
	public static void main(String[] args) {
		try {
			new TestServletDef().testSetServletNameEmptyString();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}