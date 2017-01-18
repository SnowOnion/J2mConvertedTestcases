package org.apache.catalina.startup;

import org.apache.catalina.startup.TestTomcatClassLoader;

public class MainForTestTomcatClassLoader_testDefaultClassLoader {
	public static void main(String[] args) {
		try {
			new TestTomcatClassLoader().testDefaultClassLoader();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}