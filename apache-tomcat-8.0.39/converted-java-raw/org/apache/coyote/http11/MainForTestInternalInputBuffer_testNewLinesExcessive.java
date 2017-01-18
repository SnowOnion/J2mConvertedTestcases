package org.apache.coyote.http11;

import org.apache.coyote.http11.TestInternalInputBuffer;

public class MainForTestInternalInputBuffer_testNewLinesExcessive {
	public static void main(String[] args) {
		try {
			new TestInternalInputBuffer().testNewLinesExcessive();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}