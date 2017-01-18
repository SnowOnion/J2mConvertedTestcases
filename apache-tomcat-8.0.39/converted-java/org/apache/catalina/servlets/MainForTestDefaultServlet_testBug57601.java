package org.apache.catalina.servlets;

import org.apache.catalina.servlets.TestDefaultServlet;

public class MainForTestDefaultServlet_testBug57601 {
	public static void main(String[] args) {
		try {
			new TestDefaultServlet().testBug57601();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}