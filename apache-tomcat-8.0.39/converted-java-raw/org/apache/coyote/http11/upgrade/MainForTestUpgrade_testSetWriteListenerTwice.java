package org.apache.coyote.http11.upgrade;

import org.apache.coyote.http11.upgrade.TestUpgrade;

public class MainForTestUpgrade_testSetWriteListenerTwice {
	public static void main(String[] args) {
		try {
			new TestUpgrade().testSetWriteListenerTwice();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}