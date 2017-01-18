package org.apache.coyote.http11.filters;

import org.apache.coyote.http11.filters.TestChunkedInputFilter;

public class MainForTestChunkedInputFilter_testExtensionSizeLimitExact {
	public static void main(String[] args) {
		try {
			new TestChunkedInputFilter().testExtensionSizeLimitExact();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}