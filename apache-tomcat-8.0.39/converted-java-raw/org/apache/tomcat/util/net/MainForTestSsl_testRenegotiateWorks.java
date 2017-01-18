package org.apache.tomcat.util.net;

import org.apache.tomcat.util.net.TestSsl;

public class MainForTestSsl_testRenegotiateWorks {
	public static void main(String[] args) {
		try {
			new TestSsl().testRenegotiateWorks();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}