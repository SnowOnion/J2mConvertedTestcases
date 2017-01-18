package org.apache.el;

import org.apache.el.TestELInJsp;

public class MainForTestELInJsp_testBug60032 {
	public static void main(String[] args) {
		try {
			new TestELInJsp().testBug60032();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}