package org.apache.coyote.http11.filters;

import org.apache.coyote.http11.filters.TestChunkedInputFilter;

public class MainForTestChunkedInputFilter_testChunkSizeLong {
	public static void main(String[] args) {
		try {
			new TestChunkedInputFilter().testChunkSizeLong();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}