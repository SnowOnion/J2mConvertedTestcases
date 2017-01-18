package org.apache.catalina.authenticator;

import org.apache.catalina.authenticator.TestBasicAuthParser;

public class MainForTestBasicAuthParser_testGoodCribBase64Big {
	public static void main(String[] args) {
		try {
			new TestBasicAuthParser().testGoodCribBase64Big();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}