package org.apache.coyote.http11.filters;

import org.apache.coyote.http11.filters.TestChunkedInputFilter;

public class MainForTestChunkedInputFilter_testChunkSizeEightDigit {
	public static void main(String[] args) {
		try {
			new TestChunkedInputFilter().testChunkSizeEightDigit();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}