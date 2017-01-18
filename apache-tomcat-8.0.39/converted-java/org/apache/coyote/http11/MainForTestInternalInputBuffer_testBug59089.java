package org.apache.coyote.http11;

import org.apache.coyote.http11.TestInternalInputBuffer;

public class MainForTestInternalInputBuffer_testBug59089 {
	public static void main(String[] args) {
		try {
			new TestInternalInputBuffer().testBug59089();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}