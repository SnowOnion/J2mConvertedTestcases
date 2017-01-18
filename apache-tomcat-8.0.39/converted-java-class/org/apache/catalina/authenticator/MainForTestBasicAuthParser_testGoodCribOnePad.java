package org.apache.catalina.authenticator;

import org.apache.catalina.authenticator.TestBasicAuthParser;

public class MainForTestBasicAuthParser_testGoodCribOnePad {
	public static void main(String[] args) {
		try {
			new TestBasicAuthParser().testGoodCribOnePad();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}