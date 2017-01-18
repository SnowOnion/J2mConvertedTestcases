package org.apache.coyote.ajp;

import org.apache.coyote.ajp.TestAbstractAjpProcessor;

public class MainForTestAbstractAjpProcessor_testKeepAlive {
	public static void main(String[] args) {
		try {
			new TestAbstractAjpProcessor().testKeepAlive();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}