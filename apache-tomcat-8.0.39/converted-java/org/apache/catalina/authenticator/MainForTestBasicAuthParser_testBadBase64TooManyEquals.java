package org.apache.catalina.authenticator;

import org.apache.catalina.authenticator.TestBasicAuthParser;

public class MainForTestBasicAuthParser_testBadBase64TooManyEquals {
	public static void main(String[] args) {
		try {
			new TestBasicAuthParser().testBadBase64TooManyEquals();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}