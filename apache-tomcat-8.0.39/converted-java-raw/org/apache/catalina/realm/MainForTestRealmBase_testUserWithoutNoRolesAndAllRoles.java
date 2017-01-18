package org.apache.catalina.realm;

import org.apache.catalina.realm.TestRealmBase;

public class MainForTestRealmBase_testUserWithoutNoRolesAndAllRoles {
	public static void main(String[] args) {
		try {
			new TestRealmBase().testUserWithoutNoRolesAndAllRoles();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}