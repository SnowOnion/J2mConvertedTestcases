package org.apache.catalina.tribes.group.interceptors;

import org.apache.catalina.tribes.group.interceptors.TestGzipInterceptor;

public class MainForTestGzipInterceptor_testExactBufferSize {
	public static void main(String[] args) {
		try {
			new TestGzipInterceptor().testExactBufferSize();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}