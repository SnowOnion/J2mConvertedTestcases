package org.apache.tomcat.websocket.server;

import org.apache.tomcat.websocket.server.TestUriTemplate;

public class MainForTestUriTemplate_testBasic {
	public static void main(String[] args) {
		try {
			new TestUriTemplate().testBasic();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}