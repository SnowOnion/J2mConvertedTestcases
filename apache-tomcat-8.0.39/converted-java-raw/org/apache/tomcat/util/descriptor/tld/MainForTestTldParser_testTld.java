package org.apache.tomcat.util.descriptor.tld;

import org.apache.tomcat.util.descriptor.tld.TestTldParser;

public class MainForTestTldParser_testTld {
	public static void main(String[] args) {
		try {
			new TestTldParser().testTld();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}