package org.apache.catalina.valves.rewrite;

import org.apache.catalina.valves.rewrite.TestRewriteValve;

public class MainForTestRewriteValve_testUtf8WithRewriteQsFlagsR {
	public static void main(String[] args) {
		try {
			new TestRewriteValve().testUtf8WithRewriteQsFlagsR();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}