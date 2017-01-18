package org.apache.el;

import org.apache.el.TestELInJsp;

public class MainForTestELInJsp_testBug36923 {
	public static void main(String[] args) {
		try {
			new TestELInJsp().testBug36923();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}