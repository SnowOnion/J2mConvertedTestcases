package org.apache.catalina.ssi;

import org.apache.catalina.ssi.TestExpressionParseTree;

public class MainForTestExpressionParseTree_testBug55176b {
	public static void main(String[] args) {
		try {
			new TestExpressionParseTree().testBug55176b();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}