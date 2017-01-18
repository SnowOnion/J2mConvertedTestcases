package org.apache.catalina.authenticator;

import org.apache.catalina.authenticator.TestBasicAuthParser;

public class MainForTestBasicAuthParser_testMissingUsername {
	public static void main(String[] args) {
		try {
			new TestBasicAuthParser().testMissingUsername();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}