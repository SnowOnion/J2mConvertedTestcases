package org.apache.catalina.valves.rewrite;

import org.apache.catalina.valves.rewrite.TestRewriteValve;

public class MainForTestRewriteValve_testRewriteServerVarAndEnvVar {
	public static void main(String[] args) {
		try {
			new TestRewriteValve().testRewriteServerVarAndEnvVar();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}