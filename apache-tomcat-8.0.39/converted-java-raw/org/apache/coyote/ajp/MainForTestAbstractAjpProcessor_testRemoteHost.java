package org.apache.coyote.ajp;

import org.apache.coyote.ajp.TestAbstractAjpProcessor;

public class MainForTestAbstractAjpProcessor_testRemoteHost {
	public static void main(String[] args) {
		try {
			new TestAbstractAjpProcessor().testRemoteHost();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}