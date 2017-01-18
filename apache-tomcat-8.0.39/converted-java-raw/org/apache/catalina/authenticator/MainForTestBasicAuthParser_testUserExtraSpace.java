package org.apache.catalina.authenticator;

import org.apache.catalina.authenticator.TestBasicAuthParser;

public class MainForTestBasicAuthParser_testUserExtraSpace {
	public static void main(String[] args) {
		try {
			new TestBasicAuthParser().testUserExtraSpace();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}