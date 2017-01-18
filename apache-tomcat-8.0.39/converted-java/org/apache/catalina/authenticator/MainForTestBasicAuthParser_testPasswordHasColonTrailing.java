package org.apache.catalina.authenticator;

import org.apache.catalina.authenticator.TestBasicAuthParser;

public class MainForTestBasicAuthParser_testPasswordHasColonTrailing {
	public static void main(String[] args) {
		try {
			new TestBasicAuthParser().testPasswordHasColonTrailing();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}