package org.apache.catalina.valves.rewrite;

import org.apache.catalina.valves.rewrite.TestRewriteValve;

public class MainForTestRewriteValve_testNonAsciiPathRedirect {
	public static void main(String[] args) {
		try {
			new TestRewriteValve().testNonAsciiPathRedirect();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}