package org.apache.tomcat.util.net;

import org.apache.tomcat.util.net.TestClientCert;

public class MainForTestClientCert_testClientCertPostSmaller {
	public static void main(String[] args) {
		try {
			new TestClientCert().testClientCertPostSmaller();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}