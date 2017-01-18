package org.apache.catalina.tribes.group;

import org.apache.catalina.tribes.group.TestGroupChannelStartStop;

public class MainForTestGroupChannelStartStop_testDoubleFullStart {
	public static void main(String[] args) {
		try {
			new TestGroupChannelStartStop().testDoubleFullStart();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}