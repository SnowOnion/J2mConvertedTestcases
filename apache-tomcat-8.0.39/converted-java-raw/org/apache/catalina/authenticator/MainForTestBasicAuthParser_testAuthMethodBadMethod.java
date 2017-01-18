package org.apache.catalina.authenticator;

import org.apache.catalina.authenticator.TestBasicAuthParser;

public class MainForTestBasicAuthParser_testAuthMethodBadMethod {
	public static void main(String[] args) {
		try {
			new TestBasicAuthParser().testAuthMethodBadMethod();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}