package org.apache.catalina.valves.rewrite;

import org.apache.catalina.valves.rewrite.TestRewriteValve;

public class MainForTestRewriteValve_testRewriteMissingCurlyBraceOnVar {
	public static void main(String[] args) {
		try {
			new TestRewriteValve().testRewriteMissingCurlyBraceOnVar();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}