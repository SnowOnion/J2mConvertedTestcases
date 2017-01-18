package org.apache.catalina.tribes.test.channel;

import org.apache.catalina.tribes.test.channel.TestRemoteProcessException;

public class MainForTestRemoteProcessException_testDataSendSYNCACK {
	public static void main(String[] args) {
		try {
			new TestRemoteProcessException().testDataSendSYNCACK();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}