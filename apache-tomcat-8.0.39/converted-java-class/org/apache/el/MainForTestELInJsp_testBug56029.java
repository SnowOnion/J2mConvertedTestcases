package org.apache.el;

import org.apache.el.TestELInJsp;

public class MainForTestELInJsp_testBug56029 {
	public static void main(String[] args) {
		try {
			new TestELInJsp().testBug56029();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}