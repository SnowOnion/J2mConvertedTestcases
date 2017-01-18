package org.apache.catalina.servlets;

import org.apache.catalina.servlets.TestDefaultServlet;

public class MainForTestDefaultServlet_testCustomErrorPageMissing {
	public static void main(String[] args) {
		try {
			new TestDefaultServlet().testCustomErrorPageMissing();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}