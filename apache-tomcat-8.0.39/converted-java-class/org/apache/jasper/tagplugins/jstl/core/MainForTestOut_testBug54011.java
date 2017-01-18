package org.apache.jasper.tagplugins.jstl.core;

import org.apache.jasper.tagplugins.jstl.core.TestOut;

public class MainForTestOut_testBug54011 {
	public static void main(String[] args) {
		try {
			new TestOut().testBug54011();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}