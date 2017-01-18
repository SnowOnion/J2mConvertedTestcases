package org.apache.catalina.tribes.group;

import org.apache.catalina.tribes.group.TestGroupChannelSenderConnections;

public class MainForTestGroupChannelSenderConnections_testKeepAliveCount {
	public static void main(String[] args) {
		try {
			new TestGroupChannelSenderConnections().testKeepAliveCount();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}