package org.apache.catalina.realm;

import org.apache.catalina.realm.TestRealmBase;

public class MainForTestRealmBase_testDigestSHA {
	public static void main(String[] args) {
		try {
			new TestRealmBase().testDigestSHA();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}