package org.apache.catalina.realm;

import org.apache.catalina.realm.TestRealmBase;

public class MainForTestRealmBase_testNoAuthConstraint {
	public static void main(String[] args) {
		try {
			new TestRealmBase().testNoAuthConstraint();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}