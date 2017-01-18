package org.apache.naming.resources;

import org.apache.naming.resources.TestNamingContext;

public class MainForTestNamingContext_testBug51744b {
	public static void main(String[] args) {
		try {
			new TestNamingContext().testBug51744b();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}