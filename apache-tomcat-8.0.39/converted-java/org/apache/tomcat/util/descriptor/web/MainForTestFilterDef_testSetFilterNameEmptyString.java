package org.apache.tomcat.util.descriptor.web;

import org.apache.tomcat.util.descriptor.web.TestFilterDef;

public class MainForTestFilterDef_testSetFilterNameEmptyString {
	public static void main(String[] args) {
		try {
			new TestFilterDef().testSetFilterNameEmptyString();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}