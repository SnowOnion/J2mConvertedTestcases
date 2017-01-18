package org.apache.el;

import org.apache.el.TestELInJsp;

public class MainForTestELInJsp_testBug57141 {
	public static void main(String[] args) {
		try {
			new TestELInJsp().testBug57141();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}