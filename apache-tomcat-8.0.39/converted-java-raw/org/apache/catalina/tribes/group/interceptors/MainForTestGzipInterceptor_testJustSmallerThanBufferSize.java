package org.apache.catalina.tribes.group.interceptors;

import org.apache.catalina.tribes.group.interceptors.TestGzipInterceptor;

public class MainForTestGzipInterceptor_testJustSmallerThanBufferSize {
	public static void main(String[] args) {
		try {
			new TestGzipInterceptor().testJustSmallerThanBufferSize();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}