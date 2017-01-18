package org.apache.jasper.servlet;

import org.apache.jasper.servlet.TestJspServlet;

public class MainForTestJspServlet_testBug56568c {
	public static void main(String[] args) {
		try {
			new TestJspServlet().testBug56568c();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}