package org.apache.coyote.http11.filters;

import org.apache.coyote.http11.filters.TestChunkedInputFilter;

public class MainForTestChunkedInputFilter_testEndCRLF {
	public static void main(String[] args) {
		try {
			new TestChunkedInputFilter().testEndCRLF();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}