package org.apache.catalina.startup;

import org.apache.catalina.startup.TestBootstrap;

public class MainForTestBootstrap_testUnbalancedQuotes02 {
	public static void main(String[] args) {
		try {
			new TestBootstrap().testUnbalancedQuotes02();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}