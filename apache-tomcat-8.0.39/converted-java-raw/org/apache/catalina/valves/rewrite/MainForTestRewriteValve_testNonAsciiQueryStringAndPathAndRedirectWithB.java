package org.apache.catalina.valves.rewrite;

import org.apache.catalina.valves.rewrite.TestRewriteValve;

public class MainForTestRewriteValve_testNonAsciiQueryStringAndPathAndRedirectWithB {
	public static void main(String[] args) {
		try {
			new TestRewriteValve().testNonAsciiQueryStringAndPathAndRedirectWithB();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}