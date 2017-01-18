package org.apache.tomcat.websocket.pojo;

import org.apache.tomcat.websocket.pojo.TestEncodingDecoding;

public class MainForTestEncodingDecoding_testProgrammaticEndPoints {
	public static void main(String[] args) {
		try {
			new TestEncodingDecoding().testProgrammaticEndPoints();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}