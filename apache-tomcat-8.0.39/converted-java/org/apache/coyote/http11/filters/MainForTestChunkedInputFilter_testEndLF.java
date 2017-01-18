package org.apache.coyote.http11.filters;

import org.apache.coyote.http11.filters.TestChunkedInputFilter;

public class MainForTestChunkedInputFilter_testEndLF {
	public static void main(String[] args) {
		try {
			new TestChunkedInputFilter().testEndLF();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}