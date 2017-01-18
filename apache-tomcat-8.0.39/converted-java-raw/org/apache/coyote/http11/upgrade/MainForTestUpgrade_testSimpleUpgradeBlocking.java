package org.apache.coyote.http11.upgrade;

import org.apache.coyote.http11.upgrade.TestUpgrade;

public class MainForTestUpgrade_testSimpleUpgradeBlocking {
	public static void main(String[] args) {
		try {
			new TestUpgrade().testSimpleUpgradeBlocking();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}