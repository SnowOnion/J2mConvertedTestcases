package org.apache.tomcat.util.scan;

import org.apache.tomcat.util.scan.TestJarScanner;

public class MainForTestJarScanner_testJarsToSkipFormat {
	public static void main(String[] args) {
		try {
			new TestJarScanner().testJarsToSkipFormat();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}