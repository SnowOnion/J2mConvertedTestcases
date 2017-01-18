package org.apache.coyote.http11.filters;

import org.apache.coyote.http11.filters.TestChunkedInputFilter;

public class MainForTestChunkedInputFilter_testChunkSizeMinusOne {
	public static void main(String[] args) {
		try {
			new TestChunkedInputFilter().testChunkSizeMinusOne();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}