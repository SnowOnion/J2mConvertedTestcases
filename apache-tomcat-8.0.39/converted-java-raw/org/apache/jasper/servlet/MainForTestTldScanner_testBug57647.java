package org.apache.jasper.servlet;

import org.apache.jasper.servlet.TestTldScanner;

public class MainForTestTldScanner_testBug57647 {
	public static void main(String[] args) {
		try {
			new TestTldScanner().testBug57647();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}