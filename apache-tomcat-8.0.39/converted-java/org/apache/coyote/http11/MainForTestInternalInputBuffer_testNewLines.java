package org.apache.coyote.http11;

import org.apache.coyote.http11.TestInternalInputBuffer;

public class MainForTestInternalInputBuffer_testNewLines {
	public static void main(String[] args) {
		try {
			new TestInternalInputBuffer().testNewLines();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}