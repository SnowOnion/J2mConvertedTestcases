package org.apache.coyote.http11.upgrade;

import org.apache.coyote.http11.upgrade.TestUpgrade;

public class MainForTestUpgrade_testSimpleUpgradeNonBlocking {
	public static void main(String[] args) {
		try {
			new TestUpgrade().testSimpleUpgradeNonBlocking();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}