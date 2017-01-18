package org.apache.tomcat.websocket.server;

import org.apache.tomcat.websocket.server.TestUriTemplate;

public class MainForTestUriTemplate_testOneOfTwo {
	public static void main(String[] args) {
		try {
			new TestUriTemplate().testOneOfTwo();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}