package org.apache.coyote.http11.filters;

import org.apache.coyote.http11.filters.TestChunkedInputFilter;

public class MainForTestChunkedInputFilter_testChunkSizeIntegerMinValue {
	public static void main(String[] args) {
		try {
			new TestChunkedInputFilter().testChunkSizeIntegerMinValue();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}