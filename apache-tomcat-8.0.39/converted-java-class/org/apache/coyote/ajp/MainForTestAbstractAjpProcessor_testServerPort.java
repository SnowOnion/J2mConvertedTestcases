package org.apache.coyote.ajp;

import org.apache.coyote.ajp.TestAbstractAjpProcessor;

public class MainForTestAbstractAjpProcessor_testServerPort {
	public static void main(String[] args) {
		try {
			new TestAbstractAjpProcessor().testServerPort();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}