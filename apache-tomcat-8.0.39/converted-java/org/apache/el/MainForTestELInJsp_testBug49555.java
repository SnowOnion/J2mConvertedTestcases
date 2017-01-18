package org.apache.el;

import org.apache.el.TestELInJsp;

public class MainForTestELInJsp_testBug49555 {
	public static void main(String[] args) {
		try {
			new TestELInJsp().testBug49555();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}