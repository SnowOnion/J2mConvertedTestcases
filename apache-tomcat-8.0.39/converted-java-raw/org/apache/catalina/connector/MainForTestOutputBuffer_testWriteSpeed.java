package org.apache.catalina.connector;

import org.apache.catalina.connector.TestOutputBuffer;

public class MainForTestOutputBuffer_testWriteSpeed {
	public static void main(String[] args) {
		try {
			new TestOutputBuffer().testWriteSpeed();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}