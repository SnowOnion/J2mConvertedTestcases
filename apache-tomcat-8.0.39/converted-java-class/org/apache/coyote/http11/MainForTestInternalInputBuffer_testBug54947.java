package org.apache.coyote.http11;

import org.apache.coyote.http11.TestInternalInputBuffer;

public class MainForTestInternalInputBuffer_testBug54947 {
	public static void main(String[] args) {
		try {
			new TestInternalInputBuffer().testBug54947();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}