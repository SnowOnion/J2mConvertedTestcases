package org.apache.jasper.runtime;

import org.apache.jasper.runtime.TestPageContextImpl;

public class MainForTestPageContextImpl_testDefaultBufferSize {
	public static void main(String[] args) {
		try {
			new TestPageContextImpl().testDefaultBufferSize();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}