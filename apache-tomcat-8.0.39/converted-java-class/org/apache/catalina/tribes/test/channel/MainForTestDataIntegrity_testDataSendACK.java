package org.apache.catalina.tribes.test.channel;

import org.apache.catalina.tribes.test.channel.TestDataIntegrity;

public class MainForTestDataIntegrity_testDataSendACK {
	public static void main(String[] args) {
		try {
			new TestDataIntegrity().testDataSendACK();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}