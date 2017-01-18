package org.apache.jasper.util;

import org.apache.jasper.util.TestFastRemovalDequeue;

public class MainForTestFastRemovalDequeue_testSinglePushUnpush {
	public static void main(String[] args) {
		try {
			new TestFastRemovalDequeue().testSinglePushUnpush();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}