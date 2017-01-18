package org.apache.catalina.valves.rewrite;

import org.apache.catalina.valves.rewrite.TestRewriteValve;

public class MainForTestRewriteValve_testUtf8FlagsB {
	public static void main(String[] args) {
		try {
			new TestRewriteValve().testUtf8FlagsB();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}