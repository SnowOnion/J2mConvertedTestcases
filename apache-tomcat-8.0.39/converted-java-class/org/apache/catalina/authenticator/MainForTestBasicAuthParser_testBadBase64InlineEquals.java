package org.apache.catalina.authenticator;

import org.apache.catalina.authenticator.TestBasicAuthParser;

public class MainForTestBasicAuthParser_testBadBase64InlineEquals {
	public static void main(String[] args) {
		try {
			new TestBasicAuthParser().testBadBase64InlineEquals();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}