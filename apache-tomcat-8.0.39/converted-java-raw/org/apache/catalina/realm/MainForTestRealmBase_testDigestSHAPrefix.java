package org.apache.catalina.realm;

import org.apache.catalina.realm.TestRealmBase;

public class MainForTestRealmBase_testDigestSHAPrefix {
	public static void main(String[] args) {
		try {
			new TestRealmBase().testDigestSHAPrefix();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}