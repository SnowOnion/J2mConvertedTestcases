package org.apache.jasper.runtime;

import org.apache.jasper.runtime.TestPageContextImpl;

public class MainForTestPageContextImpl_testIncludeThrowsIOException {
	public static void main(String[] args) {
		try {
			new TestPageContextImpl().testIncludeThrowsIOException();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}