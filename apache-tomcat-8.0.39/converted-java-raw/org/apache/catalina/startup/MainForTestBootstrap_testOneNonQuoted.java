package org.apache.catalina.startup;

import org.apache.catalina.startup.TestBootstrap;

public class MainForTestBootstrap_testOneNonQuoted {
	public static void main(String[] args) {
		try {
			new TestBootstrap().testOneNonQuoted();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}