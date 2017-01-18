package org.apache.catalina.authenticator;

import org.apache.catalina.authenticator.TestBasicAuthParser;

public class MainForTestBasicAuthParser_testPasswordHasColonLeading {
	public static void main(String[] args) {
		try {
			new TestBasicAuthParser().testPasswordHasColonLeading();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}