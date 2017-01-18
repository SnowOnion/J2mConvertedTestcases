package org.apache.catalina.tribes.group.interceptors;

import org.apache.catalina.tribes.group.interceptors.TestGzipInterceptor;

public class MainForTestGzipInterceptor_testJustLargerThanBufferSize {
	public static void main(String[] args) {
		try {
			new TestGzipInterceptor().testJustLargerThanBufferSize();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}