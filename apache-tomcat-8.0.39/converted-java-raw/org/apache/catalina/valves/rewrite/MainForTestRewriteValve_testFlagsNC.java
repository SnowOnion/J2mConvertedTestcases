package org.apache.catalina.valves.rewrite;

import org.apache.catalina.valves.rewrite.TestRewriteValve;

public class MainForTestRewriteValve_testFlagsNC {
	public static void main(String[] args) {
		try {
			new TestRewriteValve().testFlagsNC();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}