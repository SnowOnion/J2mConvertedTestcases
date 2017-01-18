package org.apache.catalina.valves.rewrite;

import org.apache.catalina.valves.rewrite.TestRewriteValve;

public class MainForTestRewriteValve_testNoRewrite {
	public static void main(String[] args) {
		try {
			new TestRewriteValve().testNoRewrite();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}