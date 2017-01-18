package org.apache.catalina.tribes.test.channel;

import org.apache.catalina.tribes.test.channel.TestUdpPackages;

public class MainForTestUdpPackages_testSingleDataSendNO_ACK {
	public static void main(String[] args) {
		try {
			new TestUdpPackages().testSingleDataSendNO_ACK();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}