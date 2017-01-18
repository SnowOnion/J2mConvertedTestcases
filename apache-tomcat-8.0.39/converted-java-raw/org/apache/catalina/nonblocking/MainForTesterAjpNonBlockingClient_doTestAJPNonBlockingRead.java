package org.apache.catalina.nonblocking;

import org.apache.catalina.nonblocking.TesterAjpNonBlockingClient;

public class MainForTesterAjpNonBlockingClient_doTestAJPNonBlockingRead {
	public static void main(String[] args) {
		try {
			new TesterAjpNonBlockingClient().doTestAJPNonBlockingRead();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}