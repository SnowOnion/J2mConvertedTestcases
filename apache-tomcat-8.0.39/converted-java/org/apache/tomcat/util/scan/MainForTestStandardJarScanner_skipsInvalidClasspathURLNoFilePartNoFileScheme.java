package org.apache.tomcat.util.scan;

import org.apache.tomcat.util.scan.TestStandardJarScanner;

public class MainForTestStandardJarScanner_skipsInvalidClasspathURLNoFilePartNoFileScheme {
	public static void main(String[] args) {
		try {
			new TestStandardJarScanner().skipsInvalidClasspathURLNoFilePartNoFileScheme();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}