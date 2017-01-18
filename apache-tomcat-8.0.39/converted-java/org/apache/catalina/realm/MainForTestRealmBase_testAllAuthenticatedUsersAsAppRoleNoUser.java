package org.apache.catalina.realm;

import org.apache.catalina.realm.TestRealmBase;

public class MainForTestRealmBase_testAllAuthenticatedUsersAsAppRoleNoUser {
	public static void main(String[] args) {
		try {
			new TestRealmBase().testAllAuthenticatedUsersAsAppRoleNoUser();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}