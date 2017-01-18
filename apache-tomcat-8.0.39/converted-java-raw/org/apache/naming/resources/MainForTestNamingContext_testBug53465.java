package org.apache.naming.resources;

import org.apache.naming.resources.TestNamingContext;

public class MainForTestNamingContext_testBug53465 {
	public static void main(String[] args) {
		try {
			new TestNamingContext().testBug53465();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}