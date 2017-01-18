package org.apache.catalina.core;

import org.apache.catalina.core.TestSwallowAbortedUploads;

public class MainForTestSwallowAbortedUploads_testAbortedUploadLimitedSwallow {
	public static void main(String[] args) {
		try {
			new TestSwallowAbortedUploads().testAbortedUploadLimitedSwallow();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}