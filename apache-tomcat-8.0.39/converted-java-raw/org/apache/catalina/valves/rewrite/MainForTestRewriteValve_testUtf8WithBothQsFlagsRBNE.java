package org.apache.catalina.valves.rewrite;

import org.apache.catalina.valves.rewrite.TestRewriteValve;

public class MainForTestRewriteValve_testUtf8WithBothQsFlagsRBNE {
	public static void main(String[] args) {
		try {
			new TestRewriteValve().testUtf8WithBothQsFlagsRBNE();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}