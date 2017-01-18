package org.apache.catalina.valves.rewrite;

import org.apache.catalina.valves.rewrite.TestRewriteValve;

public class MainForTestRewriteValve_testNonAsciiQueryStringWithB {
	public static void main(String[] args) {
		try {
			new TestRewriteValve().testNonAsciiQueryStringWithB();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}