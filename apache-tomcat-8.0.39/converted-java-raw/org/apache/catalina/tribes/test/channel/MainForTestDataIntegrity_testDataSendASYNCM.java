package org.apache.catalina.tribes.test.channel;

import org.apache.catalina.tribes.test.channel.TestDataIntegrity;

public class MainForTestDataIntegrity_testDataSendASYNCM {
	public static void main(String[] args) {
		try {
			new TestDataIntegrity().testDataSendASYNCM();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}