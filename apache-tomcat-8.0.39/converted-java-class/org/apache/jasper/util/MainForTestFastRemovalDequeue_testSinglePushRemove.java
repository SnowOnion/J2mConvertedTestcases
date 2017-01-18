package org.apache.jasper.util;

import org.apache.jasper.util.TestFastRemovalDequeue;

public class MainForTestFastRemovalDequeue_testSinglePushRemove {
	public static void main(String[] args) {
		try {
			new TestFastRemovalDequeue().testSinglePushRemove();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}