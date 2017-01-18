package org.apache.jasper.tagplugins.jstl.core;

import org.apache.jasper.tagplugins.jstl.core.TestSet;

public class MainForTestSet_testBug54011 {
	public static void main(String[] args) {
		try {
			new TestSet().testBug54011();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}