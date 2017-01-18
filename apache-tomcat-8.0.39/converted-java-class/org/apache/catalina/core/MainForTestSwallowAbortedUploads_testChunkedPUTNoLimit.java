package org.apache.catalina.core;

import org.apache.catalina.core.TestSwallowAbortedUploads;

public class MainForTestSwallowAbortedUploads_testChunkedPUTNoLimit {
	public static void main(String[] args) {
		try {
			new TestSwallowAbortedUploads().testChunkedPUTNoLimit();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}