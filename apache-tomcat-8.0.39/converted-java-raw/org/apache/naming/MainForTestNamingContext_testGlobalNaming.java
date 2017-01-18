package org.apache.naming;

import org.apache.naming.TestNamingContext;

public class MainForTestNamingContext_testGlobalNaming {
	public static void main(String[] args) {
		try {
			new TestNamingContext().testGlobalNaming();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}