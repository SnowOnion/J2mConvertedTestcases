package org.apache.coyote.http11;

import org.apache.coyote.http11.TestGzipOutputFilter;

public class MainForTestGzipOutputFilter_testFlushingWithGzip {
	public static void main(String[] args) {
		try {
			new TestGzipOutputFilter().testFlushingWithGzip();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}