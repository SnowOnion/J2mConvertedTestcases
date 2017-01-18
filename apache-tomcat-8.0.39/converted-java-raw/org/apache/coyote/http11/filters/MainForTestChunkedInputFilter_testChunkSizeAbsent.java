package org.apache.coyote.http11.filters;

import org.apache.coyote.http11.filters.TestChunkedInputFilter;

public class MainForTestChunkedInputFilter_testChunkSizeAbsent {
	public static void main(String[] args) {
		try {
			new TestChunkedInputFilter().testChunkSizeAbsent();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}