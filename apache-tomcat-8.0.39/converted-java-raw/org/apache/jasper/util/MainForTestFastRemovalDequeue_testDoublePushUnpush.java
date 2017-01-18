package org.apache.jasper.util;

import org.apache.jasper.util.TestFastRemovalDequeue;

public class MainForTestFastRemovalDequeue_testDoublePushUnpush {
	public static void main(String[] args) {
		try {
			new TestFastRemovalDequeue().testDoublePushUnpush();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}