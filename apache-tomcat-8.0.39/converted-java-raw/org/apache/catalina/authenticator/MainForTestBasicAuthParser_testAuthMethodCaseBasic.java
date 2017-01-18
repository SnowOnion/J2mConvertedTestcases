package org.apache.catalina.authenticator;

import org.apache.catalina.authenticator.TestBasicAuthParser;

public class MainForTestBasicAuthParser_testAuthMethodCaseBasic {
	public static void main(String[] args) {
		try {
			new TestBasicAuthParser().testAuthMethodCaseBasic();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}