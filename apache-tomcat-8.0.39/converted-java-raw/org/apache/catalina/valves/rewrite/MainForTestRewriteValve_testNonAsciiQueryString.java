package org.apache.catalina.valves.rewrite;

import org.apache.catalina.valves.rewrite.TestRewriteValve;

public class MainForTestRewriteValve_testNonAsciiQueryString {
	public static void main(String[] args) {
		try {
			new TestRewriteValve().testNonAsciiQueryString();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}