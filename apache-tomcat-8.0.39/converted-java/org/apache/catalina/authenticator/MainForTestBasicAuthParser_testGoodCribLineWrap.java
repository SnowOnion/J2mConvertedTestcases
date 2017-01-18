package org.apache.catalina.authenticator;

import org.apache.catalina.authenticator.TestBasicAuthParser;

public class MainForTestBasicAuthParser_testGoodCribLineWrap {
	public static void main(String[] args) {
		try {
			new TestBasicAuthParser().testGoodCribLineWrap();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}