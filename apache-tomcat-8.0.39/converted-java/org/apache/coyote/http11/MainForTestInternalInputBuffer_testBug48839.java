package org.apache.coyote.http11;

import org.apache.coyote.http11.TestInternalInputBuffer;

public class MainForTestInternalInputBuffer_testBug48839 {
	public static void main(String[] args) {
		try {
			new TestInternalInputBuffer().testBug48839();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}