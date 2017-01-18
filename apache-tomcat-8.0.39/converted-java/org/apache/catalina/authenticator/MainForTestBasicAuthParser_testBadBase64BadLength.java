package org.apache.catalina.authenticator;

import org.apache.catalina.authenticator.TestBasicAuthParser;

public class MainForTestBasicAuthParser_testBadBase64BadLength {
	public static void main(String[] args) {
		try {
			new TestBasicAuthParser().testBadBase64BadLength();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}