package org.apache.catalina.realm;

import org.apache.catalina.realm.TestRealmBase;

public class MainForTestRealmBase_testAllAuthenticatedUsersAsAppRoleWithUser {
	public static void main(String[] args) {
		try {
			new TestRealmBase().testAllAuthenticatedUsersAsAppRoleWithUser();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}