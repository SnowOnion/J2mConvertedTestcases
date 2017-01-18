package org.apache.coyote.ajp;

import org.apache.coyote.ajp.TestAbstractAjpProcessor;

public class MainForTestAbstractAjpProcessor_testRemoteAddr {
	public static void main(String[] args) {
		try {
			new TestAbstractAjpProcessor().testRemoteAddr();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}