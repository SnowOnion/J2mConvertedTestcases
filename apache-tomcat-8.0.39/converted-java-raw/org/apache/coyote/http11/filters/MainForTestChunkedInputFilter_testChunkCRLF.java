package org.apache.coyote.http11.filters;

import org.apache.coyote.http11.filters.TestChunkedInputFilter;

public class MainForTestChunkedInputFilter_testChunkCRLF {
	public static void main(String[] args) {
		try {
			new TestChunkedInputFilter().testChunkCRLF();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}