package org.apache.catalina.valves.rewrite;

import org.apache.catalina.valves.rewrite.TestRewriteValve;

public class MainForTestRewriteValve_testQueryString {
	public static void main(String[] args) {
		try {
			new TestRewriteValve().testQueryString();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}