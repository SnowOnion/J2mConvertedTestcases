package org.apache.coyote.ajp;

import org.apache.coyote.ajp.TestAbstractAjpProcessor;

public class MainForTestAbstractAjpProcessor_testLargeResponse {
	public static void main(String[] args) {
		try {
			new TestAbstractAjpProcessor().testLargeResponse();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}