package org.apache.catalina.realm;

import org.apache.catalina.realm.TestRealmBase;

public class MainForTestRealmBase_testDigestMD5Prefix {
	public static void main(String[] args) {
		try {
			new TestRealmBase().testDigestMD5Prefix();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}