package org.apache.el;

import org.apache.el.TestELInJsp;

public class MainForTestELInJsp_testBug42565 {
	public static void main(String[] args) {
		try {
			new TestELInJsp().testBug42565();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}