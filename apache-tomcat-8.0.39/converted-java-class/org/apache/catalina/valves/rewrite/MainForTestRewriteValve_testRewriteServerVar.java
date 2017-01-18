package org.apache.catalina.valves.rewrite;

import org.apache.catalina.valves.rewrite.TestRewriteValve;

public class MainForTestRewriteValve_testRewriteServerVar {
	public static void main(String[] args) {
		try {
			new TestRewriteValve().testRewriteServerVar();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}