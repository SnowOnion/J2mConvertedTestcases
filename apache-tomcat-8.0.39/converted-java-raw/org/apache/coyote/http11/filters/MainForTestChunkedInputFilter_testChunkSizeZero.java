package org.apache.coyote.http11.filters;

import org.apache.coyote.http11.filters.TestChunkedInputFilter;

public class MainForTestChunkedInputFilter_testChunkSizeZero {
	public static void main(String[] args) {
		try {
			new TestChunkedInputFilter().testChunkSizeZero();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}