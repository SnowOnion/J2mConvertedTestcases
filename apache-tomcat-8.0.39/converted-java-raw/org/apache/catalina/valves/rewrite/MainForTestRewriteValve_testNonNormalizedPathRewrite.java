package org.apache.catalina.valves.rewrite;

import org.apache.catalina.valves.rewrite.TestRewriteValve;

public class MainForTestRewriteValve_testNonNormalizedPathRewrite {
	public static void main(String[] args) {
		try {
			new TestRewriteValve().testNonNormalizedPathRewrite();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}