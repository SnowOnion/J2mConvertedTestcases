package org.apache.catalina.servlets;

import org.apache.catalina.servlets.TestDefaultServlet;

public class MainForTestDefaultServlet_testCustomErrorPage {
	public static void main(String[] args) {
		try {
			new TestDefaultServlet().testCustomErrorPage();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}