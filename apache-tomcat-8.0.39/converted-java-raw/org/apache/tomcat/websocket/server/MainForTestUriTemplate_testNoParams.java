package org.apache.tomcat.websocket.server;

import org.apache.tomcat.websocket.server.TestUriTemplate;

public class MainForTestUriTemplate_testNoParams {
	public static void main(String[] args) {
		try {
			new TestUriTemplate().testNoParams();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}