package org.apache.el;

import org.apache.el.TestELInJsp;

public class MainForTestELInJsp_testBug57142 {
	public static void main(String[] args) {
		try {
			new TestELInJsp().testBug57142();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}