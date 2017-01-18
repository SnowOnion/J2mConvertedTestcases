package org.apache.catalina.startup;

import org.apache.catalina.startup.TestTomcatClassLoader;

public class MainForTestTomcatClassLoader_testNonDefaultClassLoader {
	public static void main(String[] args) {
		try {
			new TestTomcatClassLoader().testNonDefaultClassLoader();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}