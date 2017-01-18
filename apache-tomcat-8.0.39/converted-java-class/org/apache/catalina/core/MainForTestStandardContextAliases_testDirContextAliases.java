package org.apache.catalina.core;

import org.apache.catalina.core.TestStandardContextAliases;

public class MainForTestStandardContextAliases_testDirContextAliases {
	public static void main(String[] args) {
		try {
			new TestStandardContextAliases().testDirContextAliases();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}