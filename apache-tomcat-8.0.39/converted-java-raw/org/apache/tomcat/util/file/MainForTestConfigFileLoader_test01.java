package org.apache.tomcat.util.file;

import org.apache.tomcat.util.file.TestConfigFileLoader;

public class MainForTestConfigFileLoader_test01 {
	public static void main(String[] args) {
		try {
			new TestConfigFileLoader().test01();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}