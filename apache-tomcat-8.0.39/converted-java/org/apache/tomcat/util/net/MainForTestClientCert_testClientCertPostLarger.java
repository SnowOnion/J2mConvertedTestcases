package org.apache.tomcat.util.net;

import org.apache.tomcat.util.net.TestClientCert;

public class MainForTestClientCert_testClientCertPostLarger {
	public static void main(String[] args) {
		try {
			new TestClientCert().testClientCertPostLarger();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}