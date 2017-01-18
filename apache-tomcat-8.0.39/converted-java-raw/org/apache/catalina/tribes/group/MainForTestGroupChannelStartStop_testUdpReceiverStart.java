package org.apache.catalina.tribes.group;

import org.apache.catalina.tribes.group.TestGroupChannelStartStop;

public class MainForTestGroupChannelStartStop_testUdpReceiverStart {
	public static void main(String[] args) {
		try {
			new TestGroupChannelStartStop().testUdpReceiverStart();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}