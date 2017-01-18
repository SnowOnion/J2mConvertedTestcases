package org.apache.jasper.servlet;

import org.apache.jasper.servlet.TestJspCServletContext;

public class MainForTestJspCServletContext_testWebresources {
	public static void main(String[] args) {
		try {
			new TestJspCServletContext().testWebresources();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}