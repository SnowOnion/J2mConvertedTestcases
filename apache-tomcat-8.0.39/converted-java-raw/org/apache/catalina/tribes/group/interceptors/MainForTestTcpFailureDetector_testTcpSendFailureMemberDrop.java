package org.apache.catalina.tribes.group.interceptors;

import org.apache.catalina.tribes.group.interceptors.TestTcpFailureDetector;

public class MainForTestTcpFailureDetector_testTcpSendFailureMemberDrop {
	public static void main(String[] args) {
		try {
			new TestTcpFailureDetector().testTcpSendFailureMemberDrop();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}