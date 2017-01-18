package org.apache.catalina.nonblocking;

import org.apache.catalina.nonblocking.TesterAjpNonBlockingClient;

public class MainForTesterAjpNonBlockingClient_testNonBlockingWrite {
	public static void main(String[] args) {
		try {
			new TesterAjpNonBlockingClient().testNonBlockingWrite();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}