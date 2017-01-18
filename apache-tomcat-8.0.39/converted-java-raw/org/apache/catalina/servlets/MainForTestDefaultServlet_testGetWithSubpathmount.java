package org.apache.catalina.servlets;

import org.apache.catalina.servlets.TestDefaultServlet;

public class MainForTestDefaultServlet_testGetWithSubpathmount {
	public static void main(String[] args) {
		try {
			new TestDefaultServlet().testGetWithSubpathmount();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}