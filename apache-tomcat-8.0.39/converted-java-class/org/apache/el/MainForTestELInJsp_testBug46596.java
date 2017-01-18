package org.apache.el;

import org.apache.el.TestELInJsp;

public class MainForTestELInJsp_testBug46596 {
	public static void main(String[] args) {
		try {
			new TestELInJsp().testBug46596();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}