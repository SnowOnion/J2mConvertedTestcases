package org.apache.catalina.core;

import org.apache.catalina.core.TestSwallowAbortedUploads;

public class MainForTestSwallowAbortedUploads_testAbortedPOSTOKNoSwallow {
	public static void main(String[] args) {
		try {
			new TestSwallowAbortedUploads().testAbortedPOSTOKNoSwallow();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}