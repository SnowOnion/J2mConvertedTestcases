package org.apache.naming.resources;

import org.apache.naming.resources.TestNamingContext;

public class MainForTestNamingContext_testBeanFactory {
	public static void main(String[] args) {
		try {
			new TestNamingContext().testBeanFactory();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}