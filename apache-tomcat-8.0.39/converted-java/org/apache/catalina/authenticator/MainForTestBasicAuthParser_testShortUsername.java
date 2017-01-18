package org.apache.catalina.authenticator;

import org.apache.catalina.authenticator.TestBasicAuthParser;

public class MainForTestBasicAuthParser_testShortUsername {
	public static void main(String[] args) {
		try {
			new TestBasicAuthParser().testShortUsername();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}