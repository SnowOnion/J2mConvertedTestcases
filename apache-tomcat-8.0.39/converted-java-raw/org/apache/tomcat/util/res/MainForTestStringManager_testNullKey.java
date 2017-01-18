package org.apache.tomcat.util.res;

import org.apache.tomcat.util.res.TestStringManager;

public class MainForTestStringManager_testNullKey {
	public static void main(String[] args) {
		try {
			new TestStringManager().testNullKey();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}