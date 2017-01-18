package org.apache.catalina.valves.rewrite;

import org.apache.catalina.valves.rewrite.TestRewriteValve;

public class MainForTestRewriteValve_testUtf8FlagsRB {
	public static void main(String[] args) {
		try {
			new TestRewriteValve().testUtf8FlagsRB();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}