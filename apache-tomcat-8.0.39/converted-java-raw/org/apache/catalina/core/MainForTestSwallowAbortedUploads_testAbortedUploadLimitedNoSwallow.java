package org.apache.catalina.core;

import org.apache.catalina.core.TestSwallowAbortedUploads;

public class MainForTestSwallowAbortedUploads_testAbortedUploadLimitedNoSwallow {
	public static void main(String[] args) {
		try {
			new TestSwallowAbortedUploads().testAbortedUploadLimitedNoSwallow();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}