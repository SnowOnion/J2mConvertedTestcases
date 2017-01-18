package org.apache.el;

import org.apache.el.TestELInJsp;

public class MainForTestELInJsp_testBug44994 {
	public static void main(String[] args) {
		try {
			new TestELInJsp().testBug44994();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}