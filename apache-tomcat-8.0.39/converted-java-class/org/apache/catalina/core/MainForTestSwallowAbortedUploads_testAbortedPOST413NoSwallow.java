package org.apache.catalina.core;

import org.apache.catalina.core.TestSwallowAbortedUploads;

public class MainForTestSwallowAbortedUploads_testAbortedPOST413NoSwallow {
	public static void main(String[] args) {
		try {
			new TestSwallowAbortedUploads().testAbortedPOST413NoSwallow();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}