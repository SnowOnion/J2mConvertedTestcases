package org.apache.catalina.startup;

import org.apache.catalina.startup.TestBootstrap;

public class MainForTestBootstrap_testTwoNonQuoted01 {
	public static void main(String[] args) {
		try {
			new TestBootstrap().testTwoNonQuoted01();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}