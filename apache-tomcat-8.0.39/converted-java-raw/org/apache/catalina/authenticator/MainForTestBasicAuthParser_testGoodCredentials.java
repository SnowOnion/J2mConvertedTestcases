package org.apache.catalina.authenticator;

import org.apache.catalina.authenticator.TestBasicAuthParser;

public class MainForTestBasicAuthParser_testGoodCredentials {
	public static void main(String[] args) {
		try {
			new TestBasicAuthParser().testGoodCredentials();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}