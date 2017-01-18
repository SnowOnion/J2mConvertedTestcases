package org.apache.catalina.valves.rewrite;

import org.apache.catalina.valves.rewrite.TestRewriteValve;

public class MainForTestRewriteValve_testRewriteMissingCurlyBraceOnMapper {
	public static void main(String[] args) {
		try {
			new TestRewriteValve().testRewriteMissingCurlyBraceOnMapper();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}