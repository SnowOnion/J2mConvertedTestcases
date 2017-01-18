package org.apache.coyote.http11.filters;

import org.apache.coyote.http11.filters.TestChunkedInputFilter;

public class MainForTestChunkedInputFilter_testChunkSizeNineDigit {
	public static void main(String[] args) {
		try {
			new TestChunkedInputFilter().testChunkSizeNineDigit();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}