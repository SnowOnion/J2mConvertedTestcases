package org.apache.catalina.authenticator;

import org.apache.catalina.authenticator.TestBasicAuthParser;

public class MainForTestBasicAuthParser_testGoodCrib {
	public static void main(String[] args) {
		try {
			new TestBasicAuthParser().testGoodCrib();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}