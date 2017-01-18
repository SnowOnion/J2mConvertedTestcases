package org.apache.catalina.core;

import org.apache.catalina.core.TestSwallowAbortedUploads;

public class MainForTestSwallowAbortedUploads_testAbortedUploadUnlimitedNoSwallow {
	public static void main(String[] args) {
		try {
			new TestSwallowAbortedUploads().testAbortedUploadUnlimitedNoSwallow();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}