package org.apache.coyote.ajp;

import org.apache.coyote.ajp.TestAbstractAjpProcessor;

public class MainForTestAbstractAjpProcessor_testZeroLengthRequestBodyGetA {
	public static void main(String[] args) {
		try {
			new TestAbstractAjpProcessor().testZeroLengthRequestBodyGetA();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}