package org.apache.catalina.tribes.group;

import org.apache.catalina.tribes.group.TestGroupChannelSenderConnections;

public class MainForTestGroupChannelSenderConnections_testConnectionLinger {
	public static void main(String[] args) {
		try {
			new TestGroupChannelSenderConnections().testConnectionLinger();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}