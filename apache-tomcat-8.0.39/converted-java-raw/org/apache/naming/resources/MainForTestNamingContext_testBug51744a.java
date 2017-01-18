package org.apache.naming.resources;

import org.apache.naming.resources.TestNamingContext;

public class MainForTestNamingContext_testBug51744a {
	public static void main(String[] args) {
		try {
			new TestNamingContext().testBug51744a();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}