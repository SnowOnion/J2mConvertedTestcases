package org.apache.catalina.valves.rewrite;

import org.apache.catalina.valves.rewrite.TestRewriteValve;

public class MainForTestRewriteValve_testRewriteMap01 {
	public static void main(String[] args) {
		try {
			new TestRewriteValve().testRewriteMap01();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}