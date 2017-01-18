package org.apache.tomcat.util.net;

import org.apache.tomcat.util.net.TestSsl;

public class MainForTestSsl_testKeyPass {
	public static void main(String[] args) {
		try {
			new TestSsl().testKeyPass();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}