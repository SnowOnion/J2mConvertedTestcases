package org.apache.coyote.http11.upgrade;

import org.apache.coyote.http11.upgrade.TestUpgrade;

public class MainForTestUpgrade_testMessagesBlocking {
	public static void main(String[] args) {
		try {
			new TestUpgrade().testMessagesBlocking();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}