package org.apache.tomcat.websocket.pojo;

import org.apache.tomcat.websocket.pojo.TestEncodingDecoding;

public class MainForTestEncodingDecoding_testGenericsCoders {
	public static void main(String[] args) {
		try {
			new TestEncodingDecoding().testGenericsCoders();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}