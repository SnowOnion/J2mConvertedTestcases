package org.apache.catalina.tribes.test.channel;

import org.apache.catalina.tribes.test.channel.TestDataIntegrity;

public class MainForTestDataIntegrity_testDataSendASYNC {
	public static void main(String[] args) {
		try {
			new TestDataIntegrity().testDataSendASYNC();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}