package org.apache.tomcat.util.net;

import org.apache.tomcat.util.net.TestClientCert;

public class MainForTestClientCert_testClientCertGetWithPreemptive {
	public static void main(String[] args) {
		try {
			new TestClientCert().testClientCertGetWithPreemptive();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}