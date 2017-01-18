package org.apache.naming.resources;

import org.apache.naming.resources.TestNamingContext;

public class MainForTestNamingContext_testLookupSingletonResource {
	public static void main(String[] args) {
		try {
			new TestNamingContext().testLookupSingletonResource();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}