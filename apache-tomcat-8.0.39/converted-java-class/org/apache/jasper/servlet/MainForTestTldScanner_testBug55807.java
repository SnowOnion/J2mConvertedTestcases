package org.apache.jasper.servlet;

import org.apache.jasper.servlet.TestTldScanner;

public class MainForTestTldScanner_testBug55807 {
	public static void main(String[] args) {
		try {
			new TestTldScanner().testBug55807();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}