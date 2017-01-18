package org.apache.naming.resources;

import org.apache.naming.resources.TestNamingContext;

public class MainForTestNamingContext_testBug52830 {
	public static void main(String[] args) {
		try {
			new TestNamingContext().testBug52830();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}