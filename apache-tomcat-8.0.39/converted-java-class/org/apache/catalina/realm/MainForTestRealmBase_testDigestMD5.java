package org.apache.catalina.realm;

import org.apache.catalina.realm.TestRealmBase;

public class MainForTestRealmBase_testDigestMD5 {
	public static void main(String[] args) {
		try {
			new TestRealmBase().testDigestMD5();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}