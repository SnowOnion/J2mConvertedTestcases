package org.apache.coyote.http11.filters;

import org.apache.coyote.http11.filters.TestChunkedInputFilter;

public class MainForTestChunkedInputFilter_testFirstTrailingHeadersCRLF {
	public static void main(String[] args) {
		try {
			new TestChunkedInputFilter().testFirstTrailingHeadersCRLF();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}