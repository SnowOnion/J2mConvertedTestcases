package org.apache.jasper.servlet;

import org.apache.jasper.servlet.TestTldScanner;

public class MainForTestTldScanner_testWithWebapp {
	public static void main(String[] args) {
		try {
			new TestTldScanner().testWithWebapp();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}