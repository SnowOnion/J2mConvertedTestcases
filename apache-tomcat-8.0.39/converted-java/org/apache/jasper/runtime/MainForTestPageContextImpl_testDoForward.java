package org.apache.jasper.runtime;

import org.apache.jasper.runtime.TestPageContextImpl;

public class MainForTestPageContextImpl_testDoForward {
	public static void main(String[] args) {
		try {
			new TestPageContextImpl().testDoForward();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}