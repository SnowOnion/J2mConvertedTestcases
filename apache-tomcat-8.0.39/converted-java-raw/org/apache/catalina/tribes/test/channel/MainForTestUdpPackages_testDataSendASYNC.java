package org.apache.catalina.tribes.test.channel;

import org.apache.catalina.tribes.test.channel.TestUdpPackages;

public class MainForTestUdpPackages_testDataSendASYNC {
	public static void main(String[] args) {
		try {
			new TestUdpPackages().testDataSendASYNC();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}