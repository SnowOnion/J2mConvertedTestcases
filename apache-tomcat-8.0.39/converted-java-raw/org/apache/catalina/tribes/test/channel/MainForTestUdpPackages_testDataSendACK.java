package org.apache.catalina.tribes.test.channel;

import org.apache.catalina.tribes.test.channel.TestUdpPackages;

public class MainForTestUdpPackages_testDataSendACK {
	public static void main(String[] args) {
		try {
			new TestUdpPackages().testDataSendACK();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}