package org.apache.coyote.ajp;

import org.apache.coyote.ajp.TestAbstractAjpProcessor;

public class MainForTestAbstractAjpProcessor_testAuthType {
	public static void main(String[] args) {
		try {
			new TestAbstractAjpProcessor().testAuthType();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}