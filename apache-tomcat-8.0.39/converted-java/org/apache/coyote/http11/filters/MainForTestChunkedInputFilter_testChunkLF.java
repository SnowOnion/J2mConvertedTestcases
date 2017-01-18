package org.apache.coyote.http11.filters;

import org.apache.coyote.http11.filters.TestChunkedInputFilter;

public class MainForTestChunkedInputFilter_testChunkLF {
	public static void main(String[] args) {
		try {
			new TestChunkedInputFilter().testChunkLF();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}