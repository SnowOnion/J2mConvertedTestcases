package org.apache.catalina.valves.rewrite;

import org.apache.catalina.valves.rewrite.TestRewriteValve;

public class MainForTestRewriteValve_testUtf8FlagsRNE {
	public static void main(String[] args) {
		try {
			new TestRewriteValve().testUtf8FlagsRNE();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}