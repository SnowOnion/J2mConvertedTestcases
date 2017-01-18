package org.apache.coyote.http11;

import org.apache.coyote.http11.TestAbstractHttp11Processor;

public class MainForTestAbstractHttp11Processor_testBug59310 {
	public static void main(String[] args) {
		try {
			new TestAbstractHttp11Processor().testBug59310();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}