package org.apache.catalina.tribes.group;

import org.apache.catalina.tribes.group.TestGroupChannelStartStop;

public class MainForTestGroupChannelStartStop_testDoublePartialStart {
	public static void main(String[] args) {
		try {
			new TestGroupChannelStartStop().testDoublePartialStart();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}