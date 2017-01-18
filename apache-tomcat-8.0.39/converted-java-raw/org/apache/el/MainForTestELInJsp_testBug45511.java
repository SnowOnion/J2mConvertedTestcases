package org.apache.el;

import org.apache.el.TestELInJsp;

public class MainForTestELInJsp_testBug45511 {
	public static void main(String[] args) {
		try {
			new TestELInJsp().testBug45511();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}