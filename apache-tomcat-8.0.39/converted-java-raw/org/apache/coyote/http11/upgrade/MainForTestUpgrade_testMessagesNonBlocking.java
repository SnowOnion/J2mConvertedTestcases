package org.apache.coyote.http11.upgrade;

import org.apache.coyote.http11.upgrade.TestUpgrade;

public class MainForTestUpgrade_testMessagesNonBlocking {
	public static void main(String[] args) {
		try {
			new TestUpgrade().testMessagesNonBlocking();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}