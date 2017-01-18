package org.apache.coyote.ajp;

import org.apache.coyote.ajp.TestAbstractAjpProcessor;

public class MainForTestAbstractAjpProcessor_testMulti {
	public static void main(String[] args) {
		try {
			new TestAbstractAjpProcessor().testMulti();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}