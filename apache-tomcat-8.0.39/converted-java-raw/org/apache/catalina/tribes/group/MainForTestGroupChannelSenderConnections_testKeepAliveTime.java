package org.apache.catalina.tribes.group;

import org.apache.catalina.tribes.group.TestGroupChannelSenderConnections;

public class MainForTestGroupChannelSenderConnections_testKeepAliveTime {
	public static void main(String[] args) {
		try {
			new TestGroupChannelSenderConnections().testKeepAliveTime();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}