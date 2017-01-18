package org.apache.el;

import org.apache.el.TestELInJsp;

public class MainForTestELInJsp_testBug47413 {
	public static void main(String[] args) {
		try {
			new TestELInJsp().testBug47413();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}