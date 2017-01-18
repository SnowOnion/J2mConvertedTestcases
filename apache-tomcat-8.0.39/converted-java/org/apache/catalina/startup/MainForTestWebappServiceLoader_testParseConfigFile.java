package org.apache.catalina.startup;

import org.apache.catalina.startup.TestWebappServiceLoader;

public class MainForTestWebappServiceLoader_testParseConfigFile {
	public static void main(String[] args) {
		try {
			new TestWebappServiceLoader().testParseConfigFile();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}