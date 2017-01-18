package org.apache.catalina.tribes.test.channel;

import org.apache.catalina.tribes.test.channel.TestUdpPackages;

public class MainForTestUdpPackages_testDataSendNO_ACK {
	public static void main(String[] args) {
		try {
			new TestUdpPackages().testDataSendNO_ACK();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}