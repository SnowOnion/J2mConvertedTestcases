package org.apache.coyote.http11;

import org.apache.coyote.http11.TestAbstractHttp11Processor;

public class MainForTestAbstractHttp11Processor_testNoChunking11NoContentLengthConnectionClose {
	public static void main(String[] args) {
		try {
			new TestAbstractHttp11Processor().testNoChunking11NoContentLengthConnectionClose();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}