package org.apache.coyote.ajp;

import org.apache.coyote.ajp.TestAbstractAjpProcessor;

public class MainForTestAbstractAjpProcessor_testLocalAddr {
	public static void main(String[] args) {
		try {
			new TestAbstractAjpProcessor().testLocalAddr();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}