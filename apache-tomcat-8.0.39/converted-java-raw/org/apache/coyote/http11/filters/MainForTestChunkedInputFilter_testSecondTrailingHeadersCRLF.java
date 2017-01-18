package org.apache.coyote.http11.filters;

import org.apache.coyote.http11.filters.TestChunkedInputFilter;

public class MainForTestChunkedInputFilter_testSecondTrailingHeadersCRLF {
	public static void main(String[] args) {
		try {
			new TestChunkedInputFilter().testSecondTrailingHeadersCRLF();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}