package org.apache.catalina.authenticator;

import org.apache.catalina.authenticator.TestBasicAuthParser;

public class MainForTestBasicAuthParser_testPasswordHasColonEmbedded {
	public static void main(String[] args) {
		try {
			new TestBasicAuthParser().testPasswordHasColonEmbedded();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}