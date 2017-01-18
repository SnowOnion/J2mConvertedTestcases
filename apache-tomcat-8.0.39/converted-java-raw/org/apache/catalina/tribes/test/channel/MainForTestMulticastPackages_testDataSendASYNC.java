package org.apache.catalina.tribes.test.channel;

import org.apache.catalina.tribes.test.channel.TestMulticastPackages;

public class MainForTestMulticastPackages_testDataSendASYNC {
	public static void main(String[] args) {
		try {
			new TestMulticastPackages().testDataSendASYNC();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}