package org.apache.catalina.valves.rewrite;

import org.apache.catalina.valves.rewrite.TestRewriteValve;

public class MainForTestRewriteValve_testNonAsciiQueryStringAndPathAndRedirect {
	public static void main(String[] args) {
		try {
			new TestRewriteValve().testNonAsciiQueryStringAndPathAndRedirect();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}