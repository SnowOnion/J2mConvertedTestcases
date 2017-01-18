package org.apache.tomcat.util.net;

import org.apache.tomcat.util.net.TestClientCert;

public class MainForTestClientCert_testClientCertGetWithoutPreemptive {
	public static void main(String[] args) {
		try {
			new TestClientCert().testClientCertGetWithoutPreemptive();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}