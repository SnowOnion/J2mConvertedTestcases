package org.apache.coyote.http11.filters;

import org.apache.coyote.http11.filters.TestChunkedInputFilter;

public class MainForTestChunkedInputFilter_testNoTrailingHeaders {
	public static void main(String[] args) {
		try {
			new TestChunkedInputFilter().testNoTrailingHeaders();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}