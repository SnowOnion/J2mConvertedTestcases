package org.apache.catalina.valves.rewrite;

import org.apache.catalina.valves.rewrite.TestRewriteValve;

public class MainForTestRewriteValve_testNonAsciiPath {
	public static void main(String[] args) {
		try {
			new TestRewriteValve().testNonAsciiPath();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}