package org.apache.juli;

import org.apache.juli.TestDateFormatCache;

public class MainForTestDateFormatCache_testBug54044 {
	public static void main(String[] args) {
		try {
			new TestDateFormatCache().testBug54044();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}