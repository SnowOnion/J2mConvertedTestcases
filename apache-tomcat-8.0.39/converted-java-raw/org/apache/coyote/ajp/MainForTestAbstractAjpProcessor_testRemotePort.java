package org.apache.coyote.ajp;

import org.apache.coyote.ajp.TestAbstractAjpProcessor;

public class MainForTestAbstractAjpProcessor_testRemotePort {
	public static void main(String[] args) {
		try {
			new TestAbstractAjpProcessor().testRemotePort();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}