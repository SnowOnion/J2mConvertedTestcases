package org.apache.tomcat.util.http.parser;

import org.apache.tomcat.util.http.parser.TestAuthorizationDigest;

public class MainForTestAuthorizationDigest_testNonTokenDirective {
	public static void main(String[] args) {
		try {
			new TestAuthorizationDigest().testNonTokenDirective();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}