package org.apache.jasper.util;

import org.apache.jasper.util.TestFastRemovalDequeue;

public class MainForTestFastRemovalDequeue_testSinglePushPop {
	public static void main(String[] args) {
		try {
			new TestFastRemovalDequeue().testSinglePushPop();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}