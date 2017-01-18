package org.apache.coyote.ajp;

import org.apache.coyote.ajp.TestAbstractAjpProcessor;

public class MainForTestAbstractAjpProcessor_testSmallBody {
	public static void main(String[] args) {
		try {
			new TestAbstractAjpProcessor().testSmallBody();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}