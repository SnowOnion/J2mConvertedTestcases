package org.apache.el;

import org.apache.el.TestELInJsp;

public class MainForTestELInJsp_testBug48112 {
	public static void main(String[] args) {
		try {
			new TestELInJsp().testBug48112();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}