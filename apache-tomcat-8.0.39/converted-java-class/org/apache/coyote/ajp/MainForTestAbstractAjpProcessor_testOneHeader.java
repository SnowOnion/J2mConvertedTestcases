package org.apache.coyote.ajp;

import org.apache.coyote.ajp.TestAbstractAjpProcessor;

public class MainForTestAbstractAjpProcessor_testOneHeader {
	public static void main(String[] args) {
		try {
			new TestAbstractAjpProcessor().testOneHeader();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}