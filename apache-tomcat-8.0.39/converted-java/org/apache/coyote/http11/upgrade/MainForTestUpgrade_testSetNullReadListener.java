package org.apache.coyote.http11.upgrade;

import org.apache.coyote.http11.upgrade.TestUpgrade;

public class MainForTestUpgrade_testSetNullReadListener {
	public static void main(String[] args) {
		try {
			new TestUpgrade().testSetNullReadListener();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}