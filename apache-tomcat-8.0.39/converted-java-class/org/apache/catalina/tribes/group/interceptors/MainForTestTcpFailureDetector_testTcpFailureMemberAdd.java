package org.apache.catalina.tribes.group.interceptors;

import org.apache.catalina.tribes.group.interceptors.TestTcpFailureDetector;

public class MainForTestTcpFailureDetector_testTcpFailureMemberAdd {
	public static void main(String[] args) {
		try {
			new TestTcpFailureDetector().testTcpFailureMemberAdd();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}