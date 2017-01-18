package org.apache.catalina.servlets;

import org.apache.catalina.servlets.TestDefaultServlet;

public class MainForTestDefaultServlet_testGetSpecials {
	public static void main(String[] args) {
		try {
			new TestDefaultServlet().testGetSpecials();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}