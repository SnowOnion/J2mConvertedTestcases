package org.apache.catalina.valves.rewrite;

import org.apache.catalina.valves.rewrite.TestRewriteValve;

public class MainForTestRewriteValve_testQueryStringRemove {
	public static void main(String[] args) {
		try {
			new TestRewriteValve().testQueryStringRemove();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}