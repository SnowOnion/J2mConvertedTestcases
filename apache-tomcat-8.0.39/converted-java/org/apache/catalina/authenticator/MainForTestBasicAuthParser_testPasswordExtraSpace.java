package org.apache.catalina.authenticator;

import org.apache.catalina.authenticator.TestBasicAuthParser;

public class MainForTestBasicAuthParser_testPasswordExtraSpace {
	public static void main(String[] args) {
		try {
			new TestBasicAuthParser().testPasswordExtraSpace();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}