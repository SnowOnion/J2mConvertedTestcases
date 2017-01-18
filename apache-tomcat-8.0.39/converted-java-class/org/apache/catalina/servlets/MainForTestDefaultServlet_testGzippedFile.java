package org.apache.catalina.servlets;

import org.apache.catalina.servlets.TestDefaultServlet;

public class MainForTestDefaultServlet_testGzippedFile {
	public static void main(String[] args) {
		try {
			new TestDefaultServlet().testGzippedFile();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}