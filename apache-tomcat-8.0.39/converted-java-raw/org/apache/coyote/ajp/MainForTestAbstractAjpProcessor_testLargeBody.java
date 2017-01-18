package org.apache.coyote.ajp;

import org.apache.coyote.ajp.TestAbstractAjpProcessor;

public class MainForTestAbstractAjpProcessor_testLargeBody {
	public static void main(String[] args) {
		try {
			new TestAbstractAjpProcessor().testLargeBody();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}