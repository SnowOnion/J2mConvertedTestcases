package org.apache.catalina.servlets;

import org.apache.catalina.servlets.TestWebdavServlet;

public class MainForTestWebdavServlet_testGetSpecials {
	public static void main(String[] args) {
		try {
			new TestWebdavServlet().testGetSpecials();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}