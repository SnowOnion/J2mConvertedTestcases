package org.apache.catalina.tribes.test.channel;

import org.apache.catalina.tribes.test.channel.TestDataIntegrity;

public class MainForTestDataIntegrity_testDataSendNO_ACK {
	public static void main(String[] args) {
		try {
			new TestDataIntegrity().testDataSendNO_ACK();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}