package org.apache.catalina.tribes.group.interceptors;

import org.apache.catalina.tribes.group.interceptors.TestGzipInterceptor;

public class MainForTestGzipInterceptor_testSmallerThanBufferSize {
	public static void main(String[] args) {
		try {
			new TestGzipInterceptor().testSmallerThanBufferSize();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}