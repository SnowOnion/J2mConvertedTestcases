package org.apache.tomcat.websocket.pojo;

import org.apache.tomcat.websocket.pojo.TestEncodingDecoding;

public class MainForTestEncodingDecoding_testAnnotatedEndPoints {
	public static void main(String[] args) {
		try {
			new TestEncodingDecoding().testAnnotatedEndPoints();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}