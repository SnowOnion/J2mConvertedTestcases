package org.apache.tomcat.util.http;

import org.apache.tomcat.util.http.TestMimeHeadersIntegration;

public class MainForTestMimeHeadersIntegration_testHeaderLimits2 {
	public static void main(String[] args) {
		try {
			new TestMimeHeadersIntegration().testHeaderLimits2();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}