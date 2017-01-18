package org.apache.coyote.http11;

import org.apache.coyote.http11.TestAbstractHttp11Processor;

public class MainForTestAbstractHttp11Processor_testBug55772 {
	public static void main(String[] args) {
		try {
			new TestAbstractHttp11Processor().testBug55772();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}