package org.apache.coyote.http11.filters;

import org.apache.coyote.http11.filters.TestChunkedInputFilter;

public class MainForTestChunkedInputFilter_testSecondTrailingHeadersLF {
	public static void main(String[] args) {
		try {
			new TestChunkedInputFilter().testSecondTrailingHeadersLF();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}