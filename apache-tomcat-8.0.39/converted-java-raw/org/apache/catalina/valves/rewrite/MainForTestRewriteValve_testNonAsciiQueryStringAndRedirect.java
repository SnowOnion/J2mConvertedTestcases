package org.apache.catalina.valves.rewrite;

import org.apache.catalina.valves.rewrite.TestRewriteValve;

public class MainForTestRewriteValve_testNonAsciiQueryStringAndRedirect {
	public static void main(String[] args) {
		try {
			new TestRewriteValve().testNonAsciiQueryStringAndRedirect();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}