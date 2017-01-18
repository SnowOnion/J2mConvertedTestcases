package org.apache.coyote.ajp;

import org.apache.coyote.ajp.TestAbstractAjpProcessor;

public class MainForTestAbstractAjpProcessor_testSecret {
	public static void main(String[] args) {
		try {
			new TestAbstractAjpProcessor().testSecret();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}