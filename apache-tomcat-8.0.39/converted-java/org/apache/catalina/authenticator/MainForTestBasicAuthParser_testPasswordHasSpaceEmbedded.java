package org.apache.catalina.authenticator;

import org.apache.catalina.authenticator.TestBasicAuthParser;

public class MainForTestBasicAuthParser_testPasswordHasSpaceEmbedded {
	public static void main(String[] args) {
		try {
			new TestBasicAuthParser().testPasswordHasSpaceEmbedded();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}