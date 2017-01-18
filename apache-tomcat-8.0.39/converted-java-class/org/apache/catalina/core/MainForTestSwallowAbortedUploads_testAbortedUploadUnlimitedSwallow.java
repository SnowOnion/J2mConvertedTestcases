package org.apache.catalina.core;

import org.apache.catalina.core.TestSwallowAbortedUploads;

public class MainForTestSwallowAbortedUploads_testAbortedUploadUnlimitedSwallow {
	public static void main(String[] args) {
		try {
			new TestSwallowAbortedUploads().testAbortedUploadUnlimitedSwallow();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}