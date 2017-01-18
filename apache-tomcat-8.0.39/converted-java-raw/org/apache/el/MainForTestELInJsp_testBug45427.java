package org.apache.el;

import org.apache.el.TestELInJsp;

public class MainForTestELInJsp_testBug45427 {
	public static void main(String[] args) {
		try {
			new TestELInJsp().testBug45427();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}