package org.apache.catalina.webresources.war;

import org.apache.catalina.webresources.war.TestWarURLConnection;

public class MainForTestWarURLConnection_testContentLength {
	public static void main(String[] args) {
		try {
			new TestWarURLConnection().testContentLength();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}