package org.apache.catalina.startup;

import org.apache.catalina.startup.TestBootstrap;

public class MainForTestBootstrap_testThreeNonQuoted {
	public static void main(String[] args) {
		try {
			new TestBootstrap().testThreeNonQuoted();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}