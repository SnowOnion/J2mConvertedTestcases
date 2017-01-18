package org.apache.catalina.realm;

import org.apache.catalina.realm.TestRealmBase;

public class MainForTestRealmBase_testUserWithNoRoles {
	public static void main(String[] args) {
		try {
			new TestRealmBase().testUserWithNoRoles();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}