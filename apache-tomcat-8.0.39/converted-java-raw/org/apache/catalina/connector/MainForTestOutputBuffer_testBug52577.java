package org.apache.catalina.connector;

import org.apache.catalina.connector.TestOutputBuffer;

public class MainForTestOutputBuffer_testBug52577 {
	public static void main(String[] args) {
		try {
			new TestOutputBuffer().testBug52577();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}