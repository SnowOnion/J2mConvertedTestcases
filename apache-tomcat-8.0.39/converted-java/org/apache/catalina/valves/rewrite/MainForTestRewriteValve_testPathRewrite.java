package org.apache.catalina.valves.rewrite;

import org.apache.catalina.valves.rewrite.TestRewriteValve;

public class MainForTestRewriteValve_testPathRewrite {
	public static void main(String[] args) {
		try {
			new TestRewriteValve().testPathRewrite();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}