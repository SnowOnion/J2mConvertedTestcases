package org.apache.naming.resources;

import org.apache.naming.resources.TestNamingContext;

public class MainForTestNamingContext_testLookupNonSingletonResource {
	public static void main(String[] args) {
		try {
			new TestNamingContext().testLookupNonSingletonResource();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}