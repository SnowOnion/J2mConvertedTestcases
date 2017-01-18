package org.apache.catalina.startup;

import org.apache.catalina.startup.TestBootstrap;

public class MainForTestBootstrap_testEmptyNonQuoted {
	public static void main(String[] args) {
		try {
			new TestBootstrap().testEmptyNonQuoted();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}