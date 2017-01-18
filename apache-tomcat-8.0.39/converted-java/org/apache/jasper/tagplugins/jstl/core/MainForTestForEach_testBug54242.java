package org.apache.jasper.tagplugins.jstl.core;

import org.apache.jasper.tagplugins.jstl.core.TestForEach;

public class MainForTestForEach_testBug54242 {
	public static void main(String[] args) {
		try {
			new TestForEach().testBug54242();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}