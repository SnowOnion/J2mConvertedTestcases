package org.apache.coyote.http11.filters;

import org.apache.coyote.http11.filters.TestChunkedInputFilter;

public class MainForTestChunkedInputFilter_testExtensionSizeLimitOneOver {
	public static void main(String[] args) {
		try {
			new TestChunkedInputFilter().testExtensionSizeLimitOneOver();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}