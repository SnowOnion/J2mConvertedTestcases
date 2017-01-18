package org.apache.tomcat.util.descriptor.tld;

import org.apache.tomcat.util.descriptor.tld.TestTldParser;

public class MainForTestTldParser_testListener {
	public static void main(String[] args) {
		try {
			new TestTldParser().testListener();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}