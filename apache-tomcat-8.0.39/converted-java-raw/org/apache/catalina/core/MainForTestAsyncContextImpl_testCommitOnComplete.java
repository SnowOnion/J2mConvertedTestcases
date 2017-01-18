package org.apache.catalina.core;

import org.apache.catalina.core.TestAsyncContextImpl;

public class MainForTestAsyncContextImpl_testCommitOnComplete {
	public static void main(String[] args) {
		try {
			new TestAsyncContextImpl().testCommitOnComplete();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}