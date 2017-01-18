package org.apache.coyote.http11;

import org.apache.coyote.http11.TestAbstractHttp11Processor;

public class MainForTestAbstractHttp11Processor_testBug57621 {
	public static void main(String[] args) {
		try {
			new TestAbstractHttp11Processor().testBug57621();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}