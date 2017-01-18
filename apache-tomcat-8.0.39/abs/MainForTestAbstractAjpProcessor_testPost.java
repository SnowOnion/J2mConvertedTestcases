package org.apache.coyote.ajp;

import org.apache.coyote.ajp.TestAbstractAjpProcessor;

public class MainForTestAbstractAjpProcessor_testPost {
	public static void main(String[] args) {
		try {
			new TestAbstractAjpProcessor().testPost();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}