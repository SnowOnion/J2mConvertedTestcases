package org.apache.catalina.valves.rewrite;

import org.apache.catalina.valves.rewrite.TestRewriteValve;

public class MainForTestRewriteValve_testNonAsciiQueryStringAndPath {
	public static void main(String[] args) {
		try {
			new TestRewriteValve().testNonAsciiQueryStringAndPath();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}