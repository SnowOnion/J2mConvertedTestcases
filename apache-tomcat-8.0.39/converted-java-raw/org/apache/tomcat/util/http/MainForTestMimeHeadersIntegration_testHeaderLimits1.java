package org.apache.tomcat.util.http;

import org.apache.tomcat.util.http.TestMimeHeadersIntegration;

public class MainForTestMimeHeadersIntegration_testHeaderLimits1 {
	public static void main(String[] args) {
		try {
			new TestMimeHeadersIntegration().testHeaderLimits1();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}