package org.apache.catalina.connector;

import org.apache.catalina.connector.TestInputBuffer;

public class MainForTestInputBuffer_testUtf8Body {
	public static void main(String[] args) {
		try {
			new TestInputBuffer().testUtf8Body();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}