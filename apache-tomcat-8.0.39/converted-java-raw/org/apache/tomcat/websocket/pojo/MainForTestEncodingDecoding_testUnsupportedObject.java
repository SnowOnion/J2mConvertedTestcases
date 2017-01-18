package org.apache.tomcat.websocket.pojo;

import org.apache.tomcat.websocket.pojo.TestEncodingDecoding;

public class MainForTestEncodingDecoding_testUnsupportedObject {
	public static void main(String[] args) {
		try {
			new TestEncodingDecoding().testUnsupportedObject();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}