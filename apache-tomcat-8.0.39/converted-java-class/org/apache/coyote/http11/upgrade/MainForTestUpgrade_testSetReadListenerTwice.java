package org.apache.coyote.http11.upgrade;

import org.apache.coyote.http11.upgrade.TestUpgrade;

public class MainForTestUpgrade_testSetReadListenerTwice {
	public static void main(String[] args) {
		try {
			new TestUpgrade().testSetReadListenerTwice();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}