package org.apache.coyote.ajp;

import org.apache.coyote.ajp.TestAbstractAjpProcessor;

public class MainForTestAbstractAjpProcessor_testServerName {
	public static void main(String[] args) {
		try {
			new TestAbstractAjpProcessor().testServerName();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}