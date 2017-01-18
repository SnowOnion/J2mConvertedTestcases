package org.apache.catalina.tribes.group.interceptors;

import org.apache.catalina.tribes.group.interceptors.TestTcpFailureDetector;

public class MainForTestTcpFailureDetector_testTcpMcastFail {
	public static void main(String[] args) {
		try {
			new TestTcpFailureDetector().testTcpMcastFail();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}