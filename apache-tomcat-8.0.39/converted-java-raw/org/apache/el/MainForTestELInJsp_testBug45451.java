package org.apache.el;

import org.apache.el.TestELInJsp;

public class MainForTestELInJsp_testBug45451 {
	public static void main(String[] args) {
		try {
			new TestELInJsp().testBug45451();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}