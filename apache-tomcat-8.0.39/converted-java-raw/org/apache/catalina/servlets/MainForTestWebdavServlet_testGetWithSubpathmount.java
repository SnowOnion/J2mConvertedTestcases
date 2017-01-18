package org.apache.catalina.servlets;

import org.apache.catalina.servlets.TestWebdavServlet;

public class MainForTestWebdavServlet_testGetWithSubpathmount {
	public static void main(String[] args) {
		try {
			new TestWebdavServlet().testGetWithSubpathmount();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}