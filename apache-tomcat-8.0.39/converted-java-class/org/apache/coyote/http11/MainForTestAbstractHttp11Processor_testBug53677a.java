package org.apache.coyote.http11;

import org.apache.coyote.http11.TestAbstractHttp11Processor;

public class MainForTestAbstractHttp11Processor_testBug53677a {
	public static void main(String[] args) {
		try {
			new TestAbstractHttp11Processor().testBug53677a();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}