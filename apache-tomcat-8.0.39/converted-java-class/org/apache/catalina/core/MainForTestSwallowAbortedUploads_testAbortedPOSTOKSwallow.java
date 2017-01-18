package org.apache.catalina.core;

import org.apache.catalina.core.TestSwallowAbortedUploads;

public class MainForTestSwallowAbortedUploads_testAbortedPOSTOKSwallow {
	public static void main(String[] args) {
		try {
			new TestSwallowAbortedUploads().testAbortedPOSTOKSwallow();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}