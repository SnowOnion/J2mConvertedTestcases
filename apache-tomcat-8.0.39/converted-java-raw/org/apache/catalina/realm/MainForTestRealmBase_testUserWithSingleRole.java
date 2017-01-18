package org.apache.catalina.realm;

import org.apache.catalina.realm.TestRealmBase;

public class MainForTestRealmBase_testUserWithSingleRole {
	public static void main(String[] args) {
		try {
			new TestRealmBase().testUserWithSingleRole();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}