package org.apache.coyote.http11.upgrade;

import org.apache.coyote.http11.upgrade.TestUpgrade;

public class MainForTestUpgrade_testFirstCallToOnWritePossible {
	public static void main(String[] args) {
		try {
			new TestUpgrade().testFirstCallToOnWritePossible();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}