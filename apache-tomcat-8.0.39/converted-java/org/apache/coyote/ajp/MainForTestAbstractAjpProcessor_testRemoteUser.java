package org.apache.coyote.ajp;

import org.apache.coyote.ajp.TestAbstractAjpProcessor;

public class MainForTestAbstractAjpProcessor_testRemoteUser {
	public static void main(String[] args) {
		try {
			new TestAbstractAjpProcessor().testRemoteUser();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}