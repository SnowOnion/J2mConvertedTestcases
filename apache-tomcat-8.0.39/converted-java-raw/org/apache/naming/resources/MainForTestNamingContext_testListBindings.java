package org.apache.naming.resources;

import org.apache.naming.resources.TestNamingContext;

public class MainForTestNamingContext_testListBindings {
	public static void main(String[] args) {
		try {
			new TestNamingContext().testListBindings();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}