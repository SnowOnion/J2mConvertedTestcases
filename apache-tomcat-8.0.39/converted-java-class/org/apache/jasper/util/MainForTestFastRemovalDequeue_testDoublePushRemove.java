package org.apache.jasper.util;

import org.apache.jasper.util.TestFastRemovalDequeue;

public class MainForTestFastRemovalDequeue_testDoublePushRemove {
	public static void main(String[] args) {
		try {
			new TestFastRemovalDequeue().testDoublePushRemove();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}