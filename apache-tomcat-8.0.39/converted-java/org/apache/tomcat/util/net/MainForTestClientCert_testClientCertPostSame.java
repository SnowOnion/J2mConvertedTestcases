package org.apache.tomcat.util.net;

import org.apache.tomcat.util.net.TestClientCert;

public class MainForTestClientCert_testClientCertPostSame {
	public static void main(String[] args) {
		try {
			new TestClientCert().testClientCertPostSame();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}