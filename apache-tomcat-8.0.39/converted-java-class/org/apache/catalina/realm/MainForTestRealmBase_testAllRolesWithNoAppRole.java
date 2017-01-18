package org.apache.catalina.realm;

import org.apache.catalina.realm.TestRealmBase;

public class MainForTestRealmBase_testAllRolesWithNoAppRole {
	public static void main(String[] args) {
		try {
			new TestRealmBase().testAllRolesWithNoAppRole();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}