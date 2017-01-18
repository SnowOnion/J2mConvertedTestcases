package org.apache.jasper.servlet;

import org.apache.jasper.servlet.TestJspServlet;

public class MainForTestJspServlet_testBug56568b {
	public static void main(String[] args) {
		try {
			new TestJspServlet().testBug56568b();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}