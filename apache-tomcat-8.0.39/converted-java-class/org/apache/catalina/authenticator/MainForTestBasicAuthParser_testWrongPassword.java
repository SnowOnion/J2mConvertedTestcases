package org.apache.catalina.authenticator;

import org.apache.catalina.authenticator.TestBasicAuthParser;

public class MainForTestBasicAuthParser_testWrongPassword {
	public static void main(String[] args) {
		try {
			new TestBasicAuthParser().testWrongPassword();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}