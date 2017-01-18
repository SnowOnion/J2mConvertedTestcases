package org.apache.el;

import org.apache.el.TestELInJsp;

public class MainForTestELInJsp_testBug51544 {
	public static void main(String[] args) {
		try {
			new TestELInJsp().testBug51544();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}