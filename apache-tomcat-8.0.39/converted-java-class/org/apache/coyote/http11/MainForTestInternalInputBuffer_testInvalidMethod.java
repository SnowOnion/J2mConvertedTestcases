package org.apache.coyote.http11;

import org.apache.coyote.http11.TestInternalInputBuffer;

public class MainForTestInternalInputBuffer_testInvalidMethod {
	public static void main(String[] args) {
		try {
			new TestInternalInputBuffer().testInvalidMethod();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}