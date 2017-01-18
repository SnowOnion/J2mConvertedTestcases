package org.apache.catalina.core;

import org.apache.catalina.core.TestSwallowAbortedUploads;

public class MainForTestSwallowAbortedUploads_testChunkedPUTLimit {
	public static void main(String[] args) {
		try {
			new TestSwallowAbortedUploads().testChunkedPUTLimit();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}