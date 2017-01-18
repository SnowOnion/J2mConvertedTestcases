package org.apache.coyote.ajp;

import org.apache.coyote.ajp.TestAbstractAjpProcessor;

public class MainForTestAbstractAjpProcessor_testZeroLengthRequestBodyGetB {
	public static void main(String[] args) {
		try {
			new TestAbstractAjpProcessor().testZeroLengthRequestBodyGetB();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}