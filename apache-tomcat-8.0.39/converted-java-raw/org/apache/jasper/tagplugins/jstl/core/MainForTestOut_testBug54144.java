package org.apache.jasper.tagplugins.jstl.core;

import org.apache.jasper.tagplugins.jstl.core.TestOut;

public class MainForTestOut_testBug54144 {
	public static void main(String[] args) {
		try {
			new TestOut().testBug54144();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}