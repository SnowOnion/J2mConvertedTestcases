package org.apache.catalina.tribes.test.channel;

import org.apache.catalina.tribes.test.channel.TestDataIntegrity;

public class MainForTestDataIntegrity_testDataSendSYNCACK {
	public static void main(String[] args) {
		try {
			new TestDataIntegrity().testDataSendSYNCACK();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}