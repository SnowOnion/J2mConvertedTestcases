package org.apache.catalina.valves.rewrite;

import org.apache.catalina.valves.rewrite.TestRewriteValve;

public class MainForTestRewriteValve_testRewriteEnvVarAndServerVar {
	public static void main(String[] args) {
		try {
			new TestRewriteValve().testRewriteEnvVarAndServerVar();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}