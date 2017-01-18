package org.apache.catalina.realm;

import org.apache.catalina.realm.TestMemoryRealm;

public class MainForTestMemoryRealm_testBug56246 {
	public static void main(String[] args) {
		try {
			new TestMemoryRealm().testBug56246();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}