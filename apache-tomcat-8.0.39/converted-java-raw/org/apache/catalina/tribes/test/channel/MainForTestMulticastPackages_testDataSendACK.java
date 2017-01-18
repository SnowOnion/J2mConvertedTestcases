package org.apache.catalina.tribes.test.channel;

import org.apache.catalina.tribes.test.channel.TestMulticastPackages;

public class MainForTestMulticastPackages_testDataSendACK {
	public static void main(String[] args) {
		try {
			new TestMulticastPackages().testDataSendACK();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}