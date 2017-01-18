package org.apache.coyote.ajp;

import org.apache.coyote.ajp.TestAbstractAjpProcessor;

public class MainForTestAbstractAjpProcessor_testPostMultipleContentLength {
	public static void main(String[] args) {
		try {
			new TestAbstractAjpProcessor().testPostMultipleContentLength();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}