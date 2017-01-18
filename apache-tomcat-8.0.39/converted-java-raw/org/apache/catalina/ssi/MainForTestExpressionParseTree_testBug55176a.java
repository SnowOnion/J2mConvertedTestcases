package org.apache.catalina.ssi;

import org.apache.catalina.ssi.TestExpressionParseTree;

public class MainForTestExpressionParseTree_testBug55176a {
	public static void main(String[] args) {
		try {
			new TestExpressionParseTree().testBug55176a();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}