package org.apache.catalina.tribes.group.interceptors;

import org.apache.catalina.tribes.group.interceptors.TestGzipInterceptor;

public class MainForTestGzipInterceptor_testMuchLargerThanBufferSize {
	public static void main(String[] args) {
		try {
			new TestGzipInterceptor().testMuchLargerThanBufferSize();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}