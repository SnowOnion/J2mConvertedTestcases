package org.apache.jasper.servlet;

import org.apache.jasper.servlet.TestJspCServletContext;

public class MainForTestJspCServletContext_testWebapp {
	public static void main(String[] args) {
		try {
			new TestJspCServletContext().testWebapp();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}