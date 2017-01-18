package org.apache.catalina.tribes.group.interceptors;

import org.apache.catalina.tribes.group.interceptors.TestGzipInterceptor;

public class MainForTestGzipInterceptor_testFactor4BufferSize {
	public static void main(String[] args) {
		try {
			new TestGzipInterceptor().testFactor4BufferSize();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}