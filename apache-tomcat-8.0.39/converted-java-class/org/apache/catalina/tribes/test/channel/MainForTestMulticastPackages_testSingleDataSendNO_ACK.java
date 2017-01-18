package org.apache.catalina.tribes.test.channel;

import org.apache.catalina.tribes.test.channel.TestMulticastPackages;

public class MainForTestMulticastPackages_testSingleDataSendNO_ACK {
	public static void main(String[] args) {
		try {
			new TestMulticastPackages().testSingleDataSendNO_ACK();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}