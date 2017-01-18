package org.apache.tomcat.util.descriptor.web;

import org.apache.tomcat.util.descriptor.web.TestSecurityConstraint;

public class MainForTestSecurityConstraint_testCreateConstraints {
	public static void main(String[] args) {
		try {
			new TestSecurityConstraint().testCreateConstraints();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}