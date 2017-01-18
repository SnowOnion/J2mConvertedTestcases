package org.apache.coyote.ajp;

import org.apache.coyote.ajp.TestAbstractAjpProcessor;

public class MainForTestAbstractAjpProcessor_testZeroLengthRequestBodyPostA {
	public static void main(String[] args) {
		try {
			new TestAbstractAjpProcessor().testZeroLengthRequestBodyPostA();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}