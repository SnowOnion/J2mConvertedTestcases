package org.apache.coyote.http11;

import org.apache.coyote.http11.TestInternalInputBuffer;

public class MainForTestInternalInputBuffer_testBug51557BoundaryStart {
	public static void main(String[] args) {
		try {
			new TestInternalInputBuffer().testBug51557BoundaryStart();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}