package org.apache.coyote.ajp;

import org.apache.coyote.ajp.TestAbstractAjpProcessor;

public class MainForTestAbstractAjpProcessor_testOneAttribute {
	public static void main(String[] args) {
		try {
			new TestAbstractAjpProcessor().testOneAttribute();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}