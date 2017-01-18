package org.apache.catalina.valves.rewrite;

import org.apache.catalina.valves.rewrite.TestRewriteValve;

public class MainForTestRewriteValve_testNoopRewrite {
	public static void main(String[] args) {
		try {
			new TestRewriteValve().testNoopRewrite();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}