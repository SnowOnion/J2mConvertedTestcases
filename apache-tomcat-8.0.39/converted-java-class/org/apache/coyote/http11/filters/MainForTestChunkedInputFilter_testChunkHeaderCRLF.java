package org.apache.coyote.http11.filters;

import org.apache.coyote.http11.filters.TestChunkedInputFilter;

public class MainForTestChunkedInputFilter_testChunkHeaderCRLF {
	public static void main(String[] args) {
		try {
			new TestChunkedInputFilter().testChunkHeaderCRLF();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}