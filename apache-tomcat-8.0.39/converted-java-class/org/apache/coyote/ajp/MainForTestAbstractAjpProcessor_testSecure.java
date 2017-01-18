package org.apache.coyote.ajp;

import org.apache.coyote.ajp.TestAbstractAjpProcessor;

public class MainForTestAbstractAjpProcessor_testSecure {
	public static void main(String[] args) {
		try {
			new TestAbstractAjpProcessor().testSecure();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}