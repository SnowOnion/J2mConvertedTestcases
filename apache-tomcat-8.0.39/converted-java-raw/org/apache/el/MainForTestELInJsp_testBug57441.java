package org.apache.el;

import org.apache.el.TestELInJsp;

public class MainForTestELInJsp_testBug57441 {
	public static void main(String[] args) {
		try {
			new TestELInJsp().testBug57441();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}