package org.apache.catalina.authenticator;

import org.apache.catalina.authenticator.TestBasicAuthParser;

public class MainForTestBasicAuthParser_testGoodCredentialsNoPassword {
	public static void main(String[] args) {
		try {
			new TestBasicAuthParser().testGoodCredentialsNoPassword();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}