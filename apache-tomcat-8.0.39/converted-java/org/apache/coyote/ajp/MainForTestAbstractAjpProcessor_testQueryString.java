package org.apache.coyote.ajp;

import org.apache.coyote.ajp.TestAbstractAjpProcessor;

public class MainForTestAbstractAjpProcessor_testQueryString {
	public static void main(String[] args) {
		try {
			new TestAbstractAjpProcessor().testQueryString();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}