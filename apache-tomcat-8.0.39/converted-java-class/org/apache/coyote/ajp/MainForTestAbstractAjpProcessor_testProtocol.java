package org.apache.coyote.ajp;

import org.apache.coyote.ajp.TestAbstractAjpProcessor;

public class MainForTestAbstractAjpProcessor_testProtocol {
	public static void main(String[] args) {
		try {
			new TestAbstractAjpProcessor().testProtocol();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}