package org.apache.tomcat.util.http.parser;

import org.apache.tomcat.util.http.parser.TestHttpParser;

public class MainForTestHttpParser_testTokenDel {
	public static void main(String[] args) {
		try {
			new TestHttpParser().testTokenDel();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}