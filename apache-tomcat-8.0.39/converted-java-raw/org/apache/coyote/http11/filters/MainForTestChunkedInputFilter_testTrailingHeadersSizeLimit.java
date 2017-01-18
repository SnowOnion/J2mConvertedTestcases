package org.apache.coyote.http11.filters;

import org.apache.coyote.http11.filters.TestChunkedInputFilter;

public class MainForTestChunkedInputFilter_testTrailingHeadersSizeLimit {
	public static void main(String[] args) {
		try {
			new TestChunkedInputFilter().testTrailingHeadersSizeLimit();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}