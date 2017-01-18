package org.apache.catalina.startup;

import org.apache.catalina.startup.TestBootstrap;

public class MainForTestBootstrap_testEmptyQuoted {
	public static void main(String[] args) {
		try {
			new TestBootstrap().testEmptyQuoted();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}