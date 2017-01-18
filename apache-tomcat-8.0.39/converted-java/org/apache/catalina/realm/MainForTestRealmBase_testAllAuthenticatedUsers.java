package org.apache.catalina.realm;

import org.apache.catalina.realm.TestRealmBase;

public class MainForTestRealmBase_testAllAuthenticatedUsers {
	public static void main(String[] args) {
		try {
			new TestRealmBase().testAllAuthenticatedUsers();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}