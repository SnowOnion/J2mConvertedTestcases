package org.apache.coyote.ajp;

import org.apache.coyote.ajp.TestAbstractAjpProcessor;

public class MainForTestAbstractAjpProcessor_testUri {
	public static void main(String[] args) {
		try {
			new TestAbstractAjpProcessor().testUri();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}