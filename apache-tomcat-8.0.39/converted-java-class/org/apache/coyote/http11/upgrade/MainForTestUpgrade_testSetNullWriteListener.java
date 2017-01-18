package org.apache.coyote.http11.upgrade;

import org.apache.coyote.http11.upgrade.TestUpgrade;

public class MainForTestUpgrade_testSetNullWriteListener {
	public static void main(String[] args) {
		try {
			new TestUpgrade().testSetNullWriteListener();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}