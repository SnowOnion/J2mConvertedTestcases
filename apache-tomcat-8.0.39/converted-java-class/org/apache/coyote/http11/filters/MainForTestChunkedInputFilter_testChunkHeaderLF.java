package org.apache.coyote.http11.filters;

import org.apache.coyote.http11.filters.TestChunkedInputFilter;

public class MainForTestChunkedInputFilter_testChunkHeaderLF {
	public static void main(String[] args) {
		try {
			new TestChunkedInputFilter().testChunkHeaderLF();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}