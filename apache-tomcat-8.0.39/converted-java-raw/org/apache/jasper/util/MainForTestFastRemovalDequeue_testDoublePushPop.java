package org.apache.jasper.util;

import org.apache.jasper.util.TestFastRemovalDequeue;

public class MainForTestFastRemovalDequeue_testDoublePushPop {
	public static void main(String[] args) {
		try {
			new TestFastRemovalDequeue().testDoublePushPop();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}