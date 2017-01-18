package org.apache.catalina.valves.rewrite;

import org.apache.catalina.valves.rewrite.TestRewriteValve;

public class MainForTestRewriteValve_testHostRewrite {
	public static void main(String[] args) {
		try {
			new TestRewriteValve().testHostRewrite();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}